package com.sbdemo.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.sbdemo.config.AliPayConfig;
import com.sbdemo.dto.BaseResponse;
import com.sbdemo.service.PayService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author aiy
 */
@RestController
@RequestMapping("/pay")
public class PayController extends BaseController{

    @Autowired
    PayService ps;

    /**
     * 支付宝支付 统一下单
     */
    @RequestMapping(value = "/newOrderAliPay",method = RequestMethod.GET)
    @ApiOperation(value="阿里支付 统一下单")
    public BaseResponse<String> aliPay(){
        AlipayTradeAppPayModel payModel = new AlipayTradeAppPayModel();
        payModel.setBody("我是测试数据");
        payModel.setSubject("App支付测试Java");
        payModel.setOutTradeNo("70501111111S001111119");
        payModel.setTimeoutExpress("30m");
        payModel.setTotalAmount("0.01");
        payModel.setProductCode("QUICK_MSECURITY_PAY");
        String order = ps.createAliOrder(payModel);
        return new BaseResponse<String>(SUCCESS,"成功请求",order);
    }

    @RequestMapping(value = "/aliPayResult",method = RequestMethod.POST)
    public void orderResult(HttpServletRequest request) throws AlipayApiException {
        //获取支付宝POST过来反馈信息
        Map<String,String> params = new HashMap<String,String>();
        Map requestParams = request.getParameterMap();
        for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用。
            //valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }
        //切记alipaypublickey是支付宝的公钥，请去open.alipay.com对应应用下查看。
        //boolean AlipaySignature.rsaCheckV1(Map<String, String> params, String publicKey, String charset, String sign_type)
        boolean flag = AlipaySignature.rsaCheckV1(params, AliPayConfig.PUBLIC_KEY, AliPayConfig.CHARSET,AliPayConfig.SIGN_TYPE);
    }

    /**
     * 微信支付 统一下单
     */
    @RequestMapping(value = "/newOrderWxPay",method = RequestMethod.GET)
    @ApiOperation(value = "微信支付 统一下单")
    public void wxPay(){

    }

}
