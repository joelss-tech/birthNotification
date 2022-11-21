<table>
<tr>
<th>GivenName</th>
<th>surname</th>
<th>NationalId</th>
<th>Age</th>
<th>Subcounty</th>
<th>District</th>
<th>Village</th>
</tr>


<% if (father) {%>

<%father.each {%>
<tr>
<td> ${ ui.format (it.givenName) }</td>
<td> ${ ui.format (it.surname) }</td>
<td> ${ ui.format (it.nationalId) }</td>
<td> ${ ui.format (it.age) }</td>
<td> ${ ui.format (it.subcounty) }</td>
<td> ${ ui.format (it.district) }</td>
<td> ${ ui.format (it.village) }</td>

      <td><a target="_blank" href='${ ui.pageLink("birthnotification2" ,"viewFather") }?fatherId=${ ui.format(it.id)}' title="View Father"><i class="icon-eye-open edit-action" > </i><a></td>
      <td><a target="_blank" href='${ ui.pageLink("birthnotification2" ,"editFather") }?fatherId=${ ui.format(it.id)}' title="Edit Father"><i class="icon-edit edit-action" > </i><a></td>
      <td><a target="_blank" href='${ ui.pageLink("birthnotification2" ,"deleteFather") }?fatherId=${ ui.format(it.id)}' title="Delete Father"><i class="icon-trash (&#xf014;) edit-action" > </i><a></td>
</tr>


<% }%>
<% } else { %>
<tr>
   <td colspan="2">${ ui.message("general.none") }</td>
</tr>

<% }%>
</table>