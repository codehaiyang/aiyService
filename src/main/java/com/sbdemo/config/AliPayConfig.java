package com.sbdemo.config;

/**
 * 阿里支付配置
 * @author aiy
 */
public class AliPayConfig {

    /**
     * 用于支付宝支付业务的入参 app_id。
     */
    public static final String APPID = "2018103061939301";

    /**
     * 用于支付宝账户登录授权业务的入参 pid。
     */
    public static final String PID = "2018103061939301";

    /**
     * 用于支付宝账户登录授权业务的入参 target_id。
     */
    public static final String TARGET_ID = "2018103061939301";

    public static final String METHOD = "alipay.trade.app.pay";

    public static final String NOTIFY_URL = "http://127.0.0.1s/aliPayResult";

    /**
     *  pkcs8 格式的商户私钥。
     *
     * 	如下私钥，RSA2_PRIVATE 或者 RSA_PRIVATE 只需要填入一个，如果两个都设置了，本 Demo 将优先
     * 	使用 RSA2_PRIVATE。RSA2_PRIVATE 可以保证商户交易在更加安全的环境下进行，建议商户使用
     * 	RSA2_PRIVATE。
     *
     * 	建议使用支付宝提供的公私钥生成工具生成和获取 RSA2_PRIVATE。
     * 	工具地址：https://doc.open.alipay.com/docs/doc.htm?treeId=291&articleId=106097&docType=1
     */
    public static final String RSA2_PRIVATE = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCLlcrmS339sZIWJgDQriw2LCrVOMvFrq0kbx+z+u2qLOTP/EgnpGfFKfcP9LCT8ikftXMM0hEDNo1ajjZJ3yXky5u9ZMVIcrrD3fAOvgHgRvOzKrll52PNFHg5Ee8CrKLQKVMqqKR9QDrM6vWrPBAVv5/7CKhAagoJ0tQN+gDnpuQrkFafyFDer6Ms3p/wtqPZ6q9reN1019gP5J5UmvgaPjl/x3X7VXJwWh0TSSVUwXLjmUvJvrDDoZxdXxxPSbTErhWtj9WM67dXcY7Rk130Kax7/1H+a8C4LULNBypToH2Eod4MEb2aBeSOf4KdNlHzIt4+hnZ1ZRtlWY/JS/AjAgMBAAECggEAAJEJE8o2prLzztc0paQvVcD0I41pdlHxLfatgEOCd3BbNWTmvhJywWAcOppZpSAUfqZz4xdvLj4ocLenDMG1G6qf5TLlghfFHkpmUQkAZPKkxpNj0UARLaHpowGpoK8msgWY6tFoaYG7O12wxZMm1Y/DjHdKh4hmpgePCMd8/XO0anAHbfI2RHsQjjITttMCeZqxVmPqGxX1GvUfPX/l7vF4CI2Bn8c7mkoWe54uNcYd1tKJfrrq2MnY2KN/9+u0THkEdj8lK+jZPn0a85q3YvhZWfD1jf7sdBihhwX/qDeqzb8gBKQvF88YEvnzbR8EOhtpOZhq5gXOR6EYacV1EQKBgQDRpBkvvfJj5yaB7wfRgwnSXZBI6u3FxzoxA4PPx4XRZRID8RAVvIyvve8jRIRJNOnV2S7P+1MyZswsdwOTpUCgkrDZTKdMrZGbBYlPzYnA9Ih+y6g3oz2bFbwbVKCOkZzQY6faEU6bFD9riy04TnRogwuCJzp/OqMIaWk8QKCqzwKBgQCqc8oL9W3HupWbN3S6UBs0/DESsWIxqbSQ/q+IqNvz2lHD+QYffXpwY8xl4WDvaph3kMprMDA7Rv41sCE0h7QtDCauppRnIrN3bISx0k/gqzE64hYk/Gd1fsBvBV5BFW57pdtx6ytUkxGnJATpCQnB3DqmMKnOYoBW5XE/c57qbQKBgBY2bPTCC4zKUSozSYDJgaDoiQEw40Cxe1j2JmE9otAtBVuljy6+a6mzVkNGXz3ifWRLPsqKtqYAfmG3uolKWS6qXFKp7JATU/o4+/OYs5/eSRgmPAypHz3vb571uI1ioFr0NDTG4K1N1+ptNL1ikrMAL5f60Bfq/ptFkADyWBPBAoGAXoE0VM0OwN5CdHyay3H+o7Hvw112A/MDmiCbUjnNObah/vXi3zLC3+11NkdvZ07Cmgg9MpDVLQh/iWTOBEH5M8C48byKK2Sh/GS+bZkdkINaGDuh63/GHO7Z4rQnPg6T4xpiQRcSPyILd5AQ6OOJ9WIVYm84tqUGYydzUqrYQUECgYEAo+FpyNPFJ4IKD6eCVDJJ7SRvlEd2pBYoxOT0hgSN6ODjqPs2UWNe71ACdv67UncDqHuGWCZWAXs/kVzGqJna3dr0J4EwQFfLFmhbRsBqMgfjiiQws5SK/FoIC/MZ7CDbfjllqk4vPffyP+l0JNpNeq1ewV+8Q+hqSlBOetZazq0=";
    public static final String RSA_PRIVATE =  "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCLlcrmS339sZIWJgDQriw2LCrVOMvFrq0kbx+z+u2qLOTP/EgnpGfFKfcP9LCT8ikftXMM0hEDNo1ajjZJ3yXky5u9ZMVIcrrD3fAOvgHgRvOzKrll52PNFHg5Ee8CrKLQKVMqqKR9QDrM6vWrPBAVv5/7CKhAagoJ0tQN+gDnpuQrkFafyFDer6Ms3p/wtqPZ6q9reN1019gP5J5UmvgaPjl/x3X7VXJwWh0TSSVUwXLjmUvJvrDDoZxdXxxPSbTErhWtj9WM67dXcY7Rk130Kax7/1H+a8C4LULNBypToH2Eod4MEb2aBeSOf4KdNlHzIt4+hnZ1ZRtlWY/JS/AjAgMBAAECggEAAJEJE8o2prLzztc0paQvVcD0I41pdlHxLfatgEOCd3BbNWTmvhJywWAcOppZpSAUfqZz4xdvLj4ocLenDMG1G6qf5TLlghfFHkpmUQkAZPKkxpNj0UARLaHpowGpoK8msgWY6tFoaYG7O12wxZMm1Y/DjHdKh4hmpgePCMd8/XO0anAHbfI2RHsQjjITttMCeZqxVmPqGxX1GvUfPX/l7vF4CI2Bn8c7mkoWe54uNcYd1tKJfrrq2MnY2KN/9+u0THkEdj8lK+jZPn0a85q3YvhZWfD1jf7sdBihhwX/qDeqzb8gBKQvF88YEvnzbR8EOhtpOZhq5gXOR6EYacV1EQKBgQDRpBkvvfJj5yaB7wfRgwnSXZBI6u3FxzoxA4PPx4XRZRID8RAVvIyvve8jRIRJNOnV2S7P+1MyZswsdwOTpUCgkrDZTKdMrZGbBYlPzYnA9Ih+y6g3oz2bFbwbVKCOkZzQY6faEU6bFD9riy04TnRogwuCJzp/OqMIaWk8QKCqzwKBgQCqc8oL9W3HupWbN3S6UBs0/DESsWIxqbSQ/q+IqNvz2lHD+QYffXpwY8xl4WDvaph3kMprMDA7Rv41sCE0h7QtDCauppRnIrN3bISx0k/gqzE64hYk/Gd1fsBvBV5BFW57pdtx6ytUkxGnJATpCQnB3DqmMKnOYoBW5XE/c57qbQKBgBY2bPTCC4zKUSozSYDJgaDoiQEw40Cxe1j2JmE9otAtBVuljy6+a6mzVkNGXz3ifWRLPsqKtqYAfmG3uolKWS6qXFKp7JATU/o4+/OYs5/eSRgmPAypHz3vb571uI1ioFr0NDTG4K1N1+ptNL1ikrMAL5f60Bfq/ptFkADyWBPBAoGAXoE0VM0OwN5CdHyay3H+o7Hvw112A/MDmiCbUjnNObah/vXi3zLC3+11NkdvZ07Cmgg9MpDVLQh/iWTOBEH5M8C48byKK2Sh/GS+bZkdkINaGDuh63/GHO7Z4rQnPg6T4xpiQRcSPyILd5AQ6OOJ9WIVYm84tqUGYydzUqrYQUECgYEAo+FpyNPFJ4IKD6eCVDJJ7SRvlEd2pBYoxOT0hgSN6ODjqPs2UWNe71ACdv67UncDqHuGWCZWAXs/kVzGqJna3dr0J4EwQFfLFmhbRsBqMgfjiiQws5SK/FoIC/MZ7CDbfjllqk4vPffyP+l0JNpNeq1ewV+8Q+hqSlBOetZazq0=";
    public static final String PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAi5XK5kt9/bGSFiYA0K4sNiwq1TjLxa6tJG8fs/rtqizkz/xIJ6RnxSn3D/Swk/IpH7VzDNIRAzaNWo42Sd8l5MubvWTFSHK6w93wDr4B4Ebzsyq5ZedjzRR4ORHvAqyi0ClTKqikfUA6zOr1qzwQFb+f+wioQGoKCdLUDfoA56bkK5BWn8hQ3q+jLN6f8Laj2eqva3jddNfYD+SeVJr4Gj45f8d1+1VycFodE0klVMFy45lLyb6ww6GcXV8cT0m0xK4VrY/VjOu3V3GO0ZNd9Cmse/9R/mvAuC1CzQcqU6B9hKHeDBG9mgXkjn+CnTZR8yLePoZ2dWUbZVmPyUvwIwIDAQAB";

    public static final String APP_PAY_URL = "https://openapi.alipay.com/gateway.do";

    public static final String FORMAT = "json";

    public static final String CHARSET = "utf-8";
    public static final String SIGN_TYPE = "RSA2";
}
