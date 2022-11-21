<%
    ui.decorateWith("appui", "standardEmrPage")
%>

<script type="text/javascript">
var breadcrumbs =[
       {icon: "icon-home", link: '/' + OPENMRS_CONTEXT_PATH + '/index.htm' }
         { label: "${ ui.message("baby details ")}" }
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
<legend>
      Notice Of Birth Of A Child
</legend>
<table>

<tr>
<th><p> Given Name : <b>${baby.givenName}<b> </p></th>
</tr>
<tr>
<th><p> Date & Time Of Birth : <b>${baby.dateOfBirth}<b> </p></th>
</tr>
<tr>
<th><p> Weight At Birth(kgs) : <b>${baby.weightAtBirth}<b> </p></th>
</tr>
<tr>
<th><p> Facility : <b>${baby.facility}<b> </p></th>
</tr>
<tr>
<th><p> District : <b>${baby.district}<b> </p></th>
</tr>
<tr>
<th><p> Village : <b>${baby.village}<b> </p></th>
</tr>
<tr>
<th><p> Gender : <b>${baby.gender}<b> </p></th>
</tr>
</table>
<button onclick="printDiv('print')"> Print Details</button>