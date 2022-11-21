<%
     ui.decorateWith("appui" ,"standardEmrPage")

%>

<script type="text/javascript">
var breadcrumbs =[
       {icon: "icon-home", link: '/' + OPENMRS_CONTEXT_PATH + '/index.htm' }
        { label: "${ ui.message("Home Page")}" }
];
</script>


<script>
if (window.history.replaceState) {
    window.history.replaceState( null,null,window.location.href );
}
</script>

<div>

<form id="registerFatherForm" method="post">

<fieldset id="registerFatherdetails" >
<legend>
         <p> Father Details</p>
</legend>

<p>
   ${ ui.includeFragment("uicommons", "field/text", [ "id": "givenName", "label": "GivenName","formFieldName": "givenName" ])}
 </p>
 <p>
   ${ ui.includeFragment("uicommons", "field/text", [ "id": "surname", "label": "Surname","formFieldName": "surname" ])}
 </p>
 <p>
   ${ ui.includeFragment("uicommons", "field/text", [ "id": "nationalId", "label": "NationalId","formFieldName": "nationalId" ])}
 </p>
 <p>
   ${ ui.includeFragment("uicommons", "field/text", [ "id": "age", "label": "Age","formFieldName": "age" ])}
 </p>
<p>
   ${ ui.includeFragment("uicommons", "field/text", [ "id": "subcounty", "label": "Subcounty","formFieldName": "subcounty" ])}
 </p>
<p>
   ${ ui.includeFragment("uicommons", "field/text", [ "id": "district", "label": "District","formFieldName": "district" ])}
 </p>
 <p>
   ${ ui.includeFragment("uicommons", "field/text", [ "id": "village", "label": "Village","formFieldName": "village" ])}
 </p>



 <button id="submit" type="submit">Register here </button>
 </fieldset>
 </form>
${ ui.includeFragment("birthnotification2","father") }
 
 </div>