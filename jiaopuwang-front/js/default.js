<script language="javascript">   
    function TabSwitch(selectedTab){   
        //1、找ID为divTab的元素；2、找className为tabs的所有LI元素（排除className为tabspace的LI元素）；3、清除所有class   
        jQuery("#divTab .tabs LI[class!='tabspace']").removeClass();   
  
        //为当前选中的tab设置class   
        jQuery("#"+selectedTab).addClass("selectedTab");   
                   
        //取得当前选中tab里的文本内容   
         var tabText = jQuery("#"+selectedTab).text();   
                   
        //当tab改变时，相应的内容也跟着改变   
         jQuery("#tabContent").empty();   
        jQuery("#tabContent").append(tabText);   
    }   
</script>