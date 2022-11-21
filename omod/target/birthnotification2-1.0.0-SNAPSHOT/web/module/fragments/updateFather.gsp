<div>
<form id="fatherForm" method="post">
<fieldset id="editFather" >
<legend>
<p> Edit Father </P>
</legend>

<input id='father_id' hidden='true' name='fatherId' value='${father.id}'/>
<p>
     GivenName <input id='givenName' name='givenName' value='${father.givenName}'/>
</p>

<p>
     DateOfBirth <input id='surname' name='surname' value='${father.surname}'/>
</p>
<p>
     Facility <input id='age' name='age' value='${father.age}'/>
</p>
<p>
     WeightAtBirth <input id='subcounty' name='subcounty' value='${father.subcounty}'/>
</p>

<p>
     District <input id='district' name='district' value='${father.district}'/>
</p>

<p>
     NationalId <input id='nationalId' name='nationalId' value='${father.nationalId}'/>
</p>


<p>
     Village <input id='village' name='village' value='${father.village}'/>
</p>


<button id="submit" type="submit">update details</button>
</fieldset>
</form>

</div>