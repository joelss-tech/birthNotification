<div>
<form id="babyForm" method="post">
<fieldset id="editNurse" >
<legend>
<p> Edit Baby .</P>

</legend>

<input id='baby_id' hidden='true' name='babyId' value='${baby.id}'/>
<p>
     GivenName <input id='givenName' name='givenName' value='${baby.givenName}'/>
</p>

<p>
     DateOfBirth <input id='dateofBirth' name='dateOfBirth' value='${baby.dateOfBirth}'/>
</p>
<p>
     Facility <input id='facility' name='facility' value='${baby.facility}'/>
</p>

<p>
     WeightAtBirth <input id='weightAtBirth' name='weightAtBirth' value='${baby.weightAtBirth}'/>
</p>
<p>
     Gender <input id='gender' name='gender' value='${baby.gender}'/>
</p>

<p>
     District <input id='district' name='district' value='${baby.district}'/>
</p>

<p>
     Village <input id='village' name='village' value='${baby.village}'/>
</p>


<button id="submit" type="submit">update details</button>
</fieldset>
</form>

</div>