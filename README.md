# IconItemViewDemo
条目点击view

## 使用

1,依赖
```
implementation 'com.zxn.iconitemview:iconitemview:1.0.9'
```
2,布局中使用
```
<com.zxn.iconitemview.IconItemView
    android:id="@+id/iiv_my_wallet"
    android:layout_width="match_parent"
    android:layout_height="@dimen/dp_45"
    android:paddingLeft="@dimen/dp_25"
    android:visibility="visible"
    app:leftIcon="@drawable/ic_wallet"
    app:leftIconPadding="@dimen/dp_16"
    app:lineColor="@color/c_dddddd"
    app:rightIcon="@drawable/right"
    app:rightIconPadding="@dimen/dp_19"
    app:text="我的钱包"
    app:rightText="进入钱包"
    app:rightTextPadding="@dimen/dp_10"
    app:rightTextColor="@color/main"
    app:textColor="@color/c_666666" />
```
3,代码中
可使用对应的属性方法.
```
```
## 标签

- 小精灵商户通v1.0.9
```
git tag -a v1.0.9 -m 'iconitemview:v1.0.9()'
git push origin v1.0.9
git tag
```
