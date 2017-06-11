# StickHeaderRecyclerView-philer
轻量级控件
类似联系人界面滑动式头部字母固定

效果图
![usage pic](./gif/stickheader.gif)


使用方法很简单
首先让你的adapter implements StickHeaderDecoration.StickHeaderInterface 
来告诉那些item需要被固定
然后为你的recyclerView.addItemDecoration(new StickHeaderDecoration(recycle));
OK

使用与原理分析见博客http://blog.csdn.net/hx3971/article/details/72967858
