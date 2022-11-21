<table>
<tr>
<th>GivenName</th>
<th>Date&TimeOfBirth</th>
<th>Facility</th>
<th>Weight(kgs)</th>
<th>Gender</th>
<th>District</th>
<th>Village</th>
</tr>


<% if (baby) {%>

<%baby.each {%>
<tr>
<td> ${ ui.format (it.givenName) }</td>
<td> ${ ui.format (it.dateOfBirth) }</td>
<td> ${ ui.format (it.facility) }</td>
<td> ${ ui.format (it.weightAtBirth) }</td>
<td> ${ ui.format (it.gender) }</td>
<td> ${ ui.format (it.district) }</td>
<td> ${ ui.format (it.village) }</td>
      <td><a target="_blank" href='${ ui.pageLink("birthnotification2" ,"registerMother") }?babyId=${ ui.format(it.id)}' title="Register Mother"><i class="icon-pencil (&#xf040;) edit-action" > </i><a></td>
      <td><a target="_blank" href='${ ui.pageLink("birthnotification2" ,"registerFather") }?babyId=${ ui.format(it.id)}' title="Register Father"><i class="icon-pencil (&#xf040;) edit-action" > </i><a></td>
      <td><a target="_blank" href='${ ui.pageLink("birthnotification2" ,"viewBaby") }?babyId=${ ui.format(it.id)}' title="View Baby"><i class="icon-eye-open edit-action" > </i><a></td>
      <td><a target="_blank" href='${ ui.pageLink("birthnotification2" ,"editBaby") }?babyId=${ ui.format(it.id)}' title="Edit Baby"><i class="icon-edit edit-action" > </i><a></td>
 <td><a target="_blank" href='${ ui.pageLink("birthnotification2" ,"printDetails") }?babyId=${ ui.format(it.id)},?fatherId=${ ui.format(it.id)},?motherId=${ui.format(it.id)}' title="Print Details"><i class="icon-file-alt (&#xf0f6;) edit-action" > </i><a></td>
      <td><a target="_blank" href='${ ui.pageLink("birthnotification2" ,"deleteBaby") }?babyId=${ ui.format(it.id)}' title="Delete Baby"><i class="icon-trash (&#xf014;) edit-action" > </i><a></td>
</tr>


<% }%>
<% } else { %>
<tr>
   <td colspan="2">${ ui.message("general.none") }</td>
</tr>

<% }%>
</table>