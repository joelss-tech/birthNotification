<%
    ui.decorateWith("appui", "standardEmrPage")
%>

<script type="text/javascript">
var breadcrumbs =[
       {icon: "icon-home", link: '/' + OPENMRS_CONTEXT_PATH + '/index.htm' }
         { label: "${ ui.message("mother details ")}" }
];
</script>

<script>
     function printDiv(divName) {
     var printContents =document.getElementById(divName).innerHTML;
     var originalContents =document.body.innerHTML;
     document.body.innerHTML=printContents
     window.print();
     document.body.innerHTML =originalContents;

     }
     ${ui.pageLink("birthnotification2","viewBaby")}
      ${ui.pageLink("birthnotification2","viewFather")}
       ${ui.pageLink("birthnotification2","viewMother")}