<%
     ui.decorateWith("appui" ,"standardEmrPage")

%>

<script type="text/javascript">
var breadcrumbs =[
       {icon: "icon-home", link: '/' + OPENMRS_CONTEXT_PATH + '/index.htm' }
        { label: "${ ui.message("Edit Baby")}" }
];
</script>

${ ui.includeFragment("birthnotification2","updateBaby")}
${ ui.includeFragment("birthnotification2","baby")}

