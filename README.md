# ColorCircleProgress
一个简单的多彩圆圈进度条。主要源码来自support v4

![Screenshot1](https://raw.githubusercontent.com/TaRGroup/ColorCircleProgress/master/image/device-2017-01-20-142224.png)
![Screenshot2](https://raw.githubusercontent.com/TaRGroup/ColorCircleProgress/master/image/device-2017-01-20-142241.png)
## 怎么用
### 添加依赖
## 添加依赖
1. 在项目级build.gradle找到相应位置添加（若已有就跳过）：
```grooxy
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
2. 应用级添加依赖：
```grooxy
compile 'com.github.TaRGroup:ColorCircleProgress:-SNAPSHOT'
```
### 添加View
向你的布局添加`ColorCircleProgress`，
随后进度条就显示了。更多功能（其实也没多少）请看Demo。


**感谢Android支持包**
## License

    Copyright 2016 TaRGroup

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.