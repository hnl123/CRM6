1. ������� My97 DatePicker 4.7��JSP�м���ʱע��ʹ�þ���·����λ����Ϊ���ڲ���ʹ�ô˾���·����λ��My97DatePicker.htmҳ�棬������ʾ����
   <script language="javascript" type="text/javascript" src="<%=request.getContextPath() %>/My97DatePicker/WdatePicker.js"></script>
   
2. �����ʾ����
   <input name="birthday" type="text" onClick="WdatePicker()">
   
3. �������ͼ��
   <input name="birthday" type="text" onClick="WdatePicker()" class="wdate">
   
   4. �޸�����ʱ���ʽ
   <input name="birthday" type="text" onClick="WdatePicker({dateFmt:'yyyyMMdd HH:mm'})" class="wdate">
   