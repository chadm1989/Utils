# Utils
收集平时Android开发用的工具类


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
