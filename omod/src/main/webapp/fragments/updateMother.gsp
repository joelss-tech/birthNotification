<div>
<form id="motherForm" method="post">
<fieldset id="editMother" >
<legend>
<p> Edit Mother Details </P>
</legend>

<input id='mother_id' hidden='true' name='motherId' value='${mother.id}'/>
<p>
     GivenName <input id='givenName' name='givenName' value='${mother.givenName}'/>
</p>

<p>
     DateOfBirth <input id='surname' name='surname' value='${mother.surname}'/>
</p>
<p>
     Facility <input id='age' name='age' value='${mother.age}'/>
</p>


<p>
     NationalId <input id='nationalId' name='nationalId' value='${mother.nationalId}'/>
</p>

<p>
     WeightAtBirth <input id='subcounty' name='subcounty' value='${mother.subcounty}'/>
</p>
<p>
     Gender <input id='parity' name='parity' value='${mother.parity}'/>
</p>

<p>
     District <input id='district' name='district' value='${mother.district}'/>
</p>

<p>
     Village <input id='village' name='village' value='${mother.village}'/>
</p>


<button id="submit" type="submit">update details</button>
</fieldset>
</form>

</div>