# Utils
收集平时Android开发用的工具类

#### 1.Log工具类 ####
- Log可以打印方法名和行号
- 默认使用文件名为TAG打印，可以使用setTag方法来改变TAG
- 使用Log.loggable来控制Log输出,在应用发布后，也可以使用手动设置Log是否打印


201802--至今 Anne日本软银定制项目
项目角色：PM

201707－201801 EMUI 5.0  BTV DCM Rom升级项目
项目角色：PL

201612－201706 EMUI 5.0 Edsion Rom 升级项目
项目角色：PM

201603－201611 SCL－L32、CAM－L32维护项目
项目角色PM

201508－201602 ALE－L02 日本软银定制项目
项目角色：SE

技术人员简历
自我评价：
学习能力强，事业心强，追求成功和卓越，敢于面对风险，承担压力，乐于从事挑战性工作；良好的协调技巧、沟通能力和团队意识；基本素质好，工作认真热情富责任心，为人坦诚、守信、自信；适应性强, 适应新思维、新方式、新问题和新环境
个人详细信息:
姓名	项超
性别	男
国籍	中国
出生日期	1989/10/18
年龄	27
语言能力	CET-6
技 能 特 长 
主要技能	1.对项目管理有一定认识，做过3个项目组的PL/PM,对华为项目管理流程，有过程管理和风险管理的能力
1.熟练掌握基于android平台的应用程序开发
a)擅长自定义View组件，熟悉View的测量和绘制原理
b)熟悉Android Framework，对ActivityManagerService、PackageManagerService、PowerManagerService等核心服务进行功能扩展
c)熟练掌握Android 系统的Activity，Intent，Provider，Service，Broadcast Receiver等组件的使用
2.熟悉Android编译系统，了解Android.mk原理及其使用
3.熟练使用Linux系统，对shell脚本有一定了解
教 育 背 景
毕业时间	2012年6月
学校名称/专业	武汉理工大学
学历	本科
工作经历
2015.08-至今	江苏润和软件股份有限公司
2015.07-2013.12	曦威胜科技开发(深圳)有限公司
2012.06-2013.11	上海斐讯数据通信技术有限公司
相关主要项目经验 (由近及远):
起始时间：2017/1-2017/4
项目名称	Edsion EMUI 5.0 ROM升级
开发环境与技术	Ubuntu，Android7.0
项目描述	Note8 从EMUI 4.1升级到EMUI 5.0项目
本人职责	项目组PM
1.	项目任务分配及进度管理，风险管理
2.	协调本项目组及周边资源，解决项目组遇到的各种问题
起始时间：2016/07-2016/12
项目名称	韩国LG U+ CAM-L32
开发环境与技术	Ubuntu，Android6.0
项目描述	韩国LG U+定制开发维护
本人职责	项目组PM
3.	与一线、第三方中科沟通，项目进展信息共享及推进
4.	协调本项目组及周边资源，解决项目组遇到的各种问题

起始时间：2016/04-2016/06
项目名称	韩国LG U+  SCL-L32
开发环境与技术	Ubuntu，Android5.1
项目描述	韩国LG U+定制项目维护
本人职责	项目组PM
1.与一线沟通MR修改问题及版本需求
2.协调组内工作，提供MR版本交付


起始时间：2015/09-2016/03
项目名称	日本软银Alice P8 Lite定制项目
开发环境与技术	Ubuntu，Android5.0
项目描述	日本软银基于P8 Lite公开市场的定制项目
本人职责	项目组SE
1.负责与客户需求澄清
2.协调项目组开发人员工作、Bug分配及完成情况统计汇报；
3.解决疑难需求、Bug

起始时间：2015/05-2015/08
项目名称	BenQ智能投影仪
开发环境与技术	Ubuntu、Android、Android Studio
项目描述	为Benq定制的智能投影仪，使用Mstar芯片，基于Android5.0
本人职责	项目组PL
1.	搭建Benq项目分支及Custom定制
2.	开发投影设置应用，包含梯形校正、流明度设置、壁纸、自动休眠等功能，在JNI和SuperNova层添加接口

起始时间：2014/08-2015/04
项目名称	海尔统帅Leader智能电视
开发环境与技术	Ubuntu、Android
项目描述	为海尔统帅定制的智能电视系统，使用Mstar芯片，基于Android4.4
本人职责	1.	开发动态Launcher应用，服务端可配置Launcher的UI界面，方便客户进行定制及广告投放
2.	对接华数应用接口，在Launcher上面提供电影、电视剧、音乐、体育等功能入口
3.	负责TV应用功能维护，包括TVPlayer、TVMenu和Hotkey
4.	后期作为PL，负责版本发布及与客户沟通

起始时间：2013/12-2015/07
项目名称	台湾Heren智能电视项目
开发环境与技术	Ubuntu、Android
项目描述	为台湾Heren客户定制的智能电视系统，使用Mstar芯片，基于Android4.2
本人职责	开发Launcher应用，负责广告功能和网页商城功能开发
1.	广告包括文字、图片、应用等，其中应用下载添加了暂停和继续下载功能，扩展了DownloadProvider 
2.	网页商城功能，添加JavaScript接口，用户登录、购买记录等。
.能力及专长 (Skills)
分类	技能名称	技能水平（精通 熟练 一般）	使用时间(月)
平台及分类	Android	熟练	46
	Linux系统	熟练	50
	Eclipse	熟练	50
	Android Studio	一般	6
	Shell	一般	24

Windows环境
将下面的代码保存为 kill-svn.bat文件，放到要删除.svn文件的目录下，双击运行即可
@echo on
@rem 删除SVN版本控制目录
@rem for /r . %%a in (.) do @if exist "%%a\.svn" @echo "%%a\.svn"
@for /r . %%a in (.) do @if exist "%%a\.svn" rd /s /q "%%a\.svn"
@echo completed
@pause
在linux下
find . -type d -name ".svn"|xargs rm -rf

Function sync_excel(excel As String, sheets() As String)

Dim wb As Workbook
Dim length, i, j, k As Integer
Dim strSht, strTarget, strcol As String


Dim sheetFrom, sheetTo As Worksheet

Set wb = Workbooks.Open(name)

Debug.Print sheets(0)


For i = 0 To sheets.Size

    Set sheetFrom = wb.Worksheets(sheets(0))
    Set sheetTo = ThisWorkbook.Worksheets(sheets(0))
    
    sheetTo.Activate

    length = sheetTo.UsedRange.Rows.Count

    For j = 1 To length
    
    If Len(sheetFrom.Range(owners(i) & j).Value) > 0 Then
    
        

Next i


lixuhui = "D:\work\项目事务\haydn rom升级项目\lixuhui.xls"
zhangfeng = "D:\work\项目事务\haydn rom升级项目\zhangfeng.xls"
zengtao = "D:\work\项目事务\haydn rom升级项目\zengtao.xls"
wangping = "D:\work\项目事务\haydn rom升级项目\wangping.xls"
