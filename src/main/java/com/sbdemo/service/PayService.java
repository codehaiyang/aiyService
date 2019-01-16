package com.sbdemo.service;

import com.alipay.api.AlipayApiException;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.sbdemo.config.AliPayConfig;
import org.springframework.stereotype.Service;

/**
 * @author aiy
 */
@Service
public class PayService  {

    public String createAliOrder(AlipayTradeAppPayModel payModel){
        // 实例化客户端
        DefaultAlipayClient client = new DefaultAlipayClient(
                AliPayConfig.APP_PAY_URL,
                AliPayConfig.APPID,
                AliPayConfig.RSA2_PRIVATE,
                AliPayConfig.FORMAT,
                AliPayConfig.CHARSET,
                AliPayConfig.PUBLIC_KEY,
                AliPayConfig.SIGN_TYPE);
        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
        request.setNotifyUrl(AliPayConfig.NOTIFY_URL);
        request.setBizModel(payModel);
        AlipayTradeAppPayResponse response = null;
        try {
            response = client.sdkExecute(request);
            System.out.println(response.getBody());
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        return response.getBody();
    }

}
