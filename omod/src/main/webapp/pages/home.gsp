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

<form id="babyForm" method="post">

<fieldset id="registerbabydetails" >
<legend>
         <p> register Baby Details</p>
</legend>

<p>
   ${ ui.includeFragment("uicommons", "field/text", [ "id": "givenName", "label": "GivenName","formFieldName": "givenName" ])}
 </p>
 <p>
   ${ ui.includeFragment("uicommons", "field/text", [ "id": "dateOfBirth", "label": "Date&TimeOfBirth (dd-MM-yyyy HH:mm:ss)","formFieldName": "dateOfBirth" ])}
 </p>
 <p>
   ${ ui.includeFragment("uicommons", "field/text", [ "id": "facility", "label": "Facility","formFieldName": "facility" ])}
 </p>
 <p>
   ${ ui.includeFragment("uicommons", "field/text", [ "id": "weightAtBirth", "label": "WeightAtBirth(kgs)","formFieldName": "weightAtBirth" ])}
 </p>
<p>
   ${ ui.includeFragment("uicommons", "field/text", [ "id": "gender", "label": "Gender","formFieldName": "gender" ])}
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
 ${ ui.includeFragment("birthnotification2","baby") }
 
 </div>