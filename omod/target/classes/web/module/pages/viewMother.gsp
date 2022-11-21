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
     
</script>

<div id='print'>

<div style="margin-right:20px">

<table>
<tr>
<th><p> Given Name : <b>${mother.givenName}<b> </p></th>
</tr>
<tr>
<th><p> Surname : <b>${mother.surname}<b> </p></th>
</tr>
<tr>
<th><p> Age : <b>${mother.age}<b> </p></th>
</tr>
<tr>
<th><p> Subcounty : <b>${mother.subcounty}<b> </p></th>
</tr>
<tr>
<th><p> District : <b>${mother.district}<b> </p></th>
</tr>
<tr>
<th><p> Village : <b>${mother.village}<b> </p></th>
</tr>
<tr>
<th><p> NationalId : <b>${mother.nationalId}<b> </p></th>
</tr>
<tr>
<th><p> parity : <b>${mother.parity}<b> </p></th>
</tr>


</table>

<button onclick="printDiv('print')"> Print Details</button>