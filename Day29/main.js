var name;

$(document).ready(function() {
	getChannels();
		$("input").click(function() {
    		name = $("input[name=rb]:checked").val();
			console.log(name);
		});
	$("#send").click(function() {
    	var msg = $("#txta").val();
 	  	var token = getSlackToken();
	  $.ajax("https://slack.com/api/chat.postMessage?",{
	   method: "POST", 
	  data: {
	  	token: token,
	 	channel: name,
	   	text: msg
	   }
		}).then(function() {
	  	$("#txta").val("");
	  // console.log(result);
		});
	});
});

function getChannels () {
		var leftSide = $("#left");
		var item = $('<input  type="radio" name="rb" value="general"><b>general</b></input><br><br>');
		leftSide.append(item);
		var item2 = $('<input  type="radio" name="rb" value="random"><b>random</b></input><br><br>');
		leftSide.append(item2);
		var item3 = $('<input  type="radio" name="rb" value="resources"><b>resources</b></input><br><br>');
		leftSide.append(item3);
		var item4 = $('<input  type="radio" name="rb" value="slackbots"><b>slackbots</b></input><br><br>');
		leftSide.append(item4);
		var item5 = $('<input  type="radio" name="rb" value="team-a-resources"><b>team-a-resources<b></input><br><br>');
		leftSide.append(item5);
}

