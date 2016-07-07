出现错误

Error:java.lang.UnsupportedClassVersionError: com/android/dx/command/Main : Unsupported major.minor version 52.0

修改

在app的build.gradle中，修改为
<pre>
<code>
compileSdkVersion 23
buildToolsVersion "23.0.3"
</code>
</pre>

文件夹结构Android studio生成的与Eclipse生成的有很大不同，其实还是有点适应原来的结构，不过只能用新的结构来做了。

* app/src/main/java  代码
* app/src/main/res   资源
* AndroidManifest.xml文件
