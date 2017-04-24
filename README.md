# PayUI


#### 预览
![](https://user-gold-cdn.xitu.io/2017/4/24/0d7f90c1447ecf0f54180a9c76917502.gif)

#### 使用
这个弹出层是一个DialogFragment，逻辑都封装在其内部，使用起来很简单：

```
Bundle bundle = new Bundle();
bundle.putString(PayFragment.EXTRA_CONTENT, "提现：¥ " + 100.00);

PayFragment fragment = new PayFragment();
fragment.setArguments(bundle);
fragment.setPaySuccessCallBack(MainActivity.this);
fragment.show(getSupportFragmentManager(), "Pay");
```

通过InputCallBack接口回调输入的支付密码，可以在回调方法中请求判断支付密码是不是正确的，也可以在PayFragment内部自己修改判断，没有用到什么高深的技术，大家看代码自然就明白了。

博客地址: [Blog](http://xdeveloper.cn/pay-ui/)
