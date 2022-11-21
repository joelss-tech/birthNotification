 <%
    ui.decorateWith("appui", "standardEmrPage")
%>

<script type="text/javascript">
var breadcrumbs =[
       {icon: "icon-home", link: '/' + OPENMRS_CONTEXT_PATH + '/index.htm' }
         { label: "${ ui.message("Father details ")}" }
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
     
</script>

<div id='print'>

<div style="margin-right:20px">

 <table>

<tr>
<th><p> Given Name : <b>${father.givenName}<b> </p></th>
</tr>
<tr>
<th><p> Surname : <b>${father.surname}<b> </p></th>
</tr>
<tr>
<th><p> Age : <b>${father.age}<b> </p></th>
</tr>
<tr>
<th><p> Subcounty : <b>${father.subcounty}<b> </p></th>
</tr>
<tr>
<th><p> District : <b>${father.district}<b> </p></th>
</tr>
<tr>
<th><p> Village : <b>${father.village}<b> </p></th>
</tr>
<tr>
<th><p> nationalId : <b>${father.nationalId}<b> </p></th>
</tr>
</table>
 
 <table>

 <button onclick="printDiv('print')"> Print Details</button>