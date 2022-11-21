<table>
<tr>
<th>GivenName</th>
<th>Surname</th>
<th>NationalId</th>
<th>Age</th>
<th>Parity</th>
<th>Subcounty</th>
<th>District</th>
<th>Village</th>
</tr>


<% if (mother) {%>

<%mother.each {%>
<tr>
<td> ${ ui.format (it.givenName) }</td>
<td> ${ ui.format (it.surname) }</td>
<td> ${ ui.format (it.nationalId) }</td>
<td> ${ ui.format (it.age) }</td>
<td> ${ ui.format (it.parity) }</td>
<td> ${ ui.format (it.subcounty) }</td>
<td> ${ ui.format (it.district) }</td>
<td> ${ ui.format (it.village) }</td>

      <td><a target="_blank" href='${ ui.pageLink("birthnotification2" ,"viewMother") }?motherId=${ ui.format(it.id)}' title="View Mother"><i class="icon-eye-open edit-action" > </i><a></td>
      <td><a target="_blank" href='${ ui.pageLink("birthnotification2" ,"editMother") }?motherId=${ ui.format(it.id)}' title="Edit Mother"><i class="icon-edit edit-action" > </i><a></td>
      <td><a target="_blank" href='${ ui.pageLink("birthnotification2" ,"deleteMother") }?motherId=${ ui.format(it.id)}' title="Delete Mother"><i class="icon-trash (&#xf014;) edit-action" > </i><a></td>
</tr>


<% }%>
<% } else { %>
<tr>
   <td colspan="2">${ ui.message("general.none") }</td>
</tr>

<% }%>
</table>