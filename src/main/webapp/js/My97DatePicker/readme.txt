1. 日历插件 My97 DatePicker 4.7在JSP中加载时注意使用绝对路径定位，因为其内部还使用此绝对路径定位到My97DatePicker.htm页面，用来显示日历
   <script language="javascript" type="text/javascript" src="<%=request.getContextPath() %>/My97DatePicker/WdatePicker.js"></script>
   
2. 如何显示日历
   <input name="birthday" type="text" onClick="WdatePicker()">
   
3. 添加日历图标
   <input name="birthday" type="text" onClick="WdatePicker()" class="wdate">
   
   4. 修改日期时间格式
   <input name="birthday" type="text" onClick="WdatePicker({dateFmt:'yyyyMMdd HH:mm'})" class="wdate">
   