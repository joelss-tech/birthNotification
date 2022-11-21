<%
     ui.decorateWith("appui" ,"standardEmrPage")

%>

<script type="text/javascript">
var breadcrumbs =[
       {icon: "icon-home", link: '/' + OPENMRS_CONTEXT_PATH + '/index.htm' }
        { label: "${ ui.message("Edit Mother")}" }
];
</script>

${ ui.includeFragment("birthnotification2","updateMother")}
${ ui.includeFragment("birthnotification2","mother")}

