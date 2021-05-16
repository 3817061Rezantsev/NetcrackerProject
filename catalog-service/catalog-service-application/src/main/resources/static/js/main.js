

app = new Vue({
	el : '#app',
	template : '<video controls width="400" height="400"'+
       			'autoplay loop muted preload="auto"'+
       			'poster="poster.png">'+
  				'<source src="ILUMILAND - Позови кота с собой..mp4" type="video/mp4">'+
  				'<source src="ILUMILAND - Позови кота с собой..webm" type="video/webm">'+
  				'<p>Your browser doesn't support HTML video. Here is a <a href="rabbit320.mp4">link to the video</a> instead.</p>'+
				'</video>',
	data : {
		messages : []
	}
});
