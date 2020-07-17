function timeConversion(s) {
  let hours = Number(s.slice(0, 2));
  if (s.slice(8, 10) == "PM") {
    if (s.slice(0, 2) != "12") {
      hours += 12;
    }
  } else if (s.slice(0, 2) == "12") {
    hours = 0;
  }

  if (hours < 10) {
    hours = "0" + hours;
  }
  return hours + s.slice(2, 8);
}

timeConversion("07:05:45PM");
timeConversion("12:00:00AM");
timeConversion("12:00:00PM");
timeConversion("12:04:00AM");
timeConversion("12:04:00PM");
