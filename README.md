# Implicit Intents Demo

## Demo App for Implicit intents by using Implicit intent to invoke map App,open webpage in browser and share media/file.

As we know intent is a call for or request for an Action.
Implict intent is the type of intent we when we don't know or care how our request will be fullfilled.
Implicit intent include an Action (eg ACTION_VIEW) and data URI.

Action says what you are trying to do
The data Uri is what you are passing onto the action.

## URI: 
    URI is a string of characters that identifies a resource. also URI is a refrence pointing to the actuall data/resource.
## formal form of URI: 
    Scheme:[//[user:password@]host[:port]] [/]path[?query][#fragment]
    anything between the brackets is optional.
## Breakdown of URI:
    so URI can be broken down into 5 parts given below.
      Scheme =  scheme describe what type of resource we are pointing to (eg mailto ,geo,https).
      authority= authority is the part where we describe user name,password and host.
      path=      path is further navigation to resource eg (/courses/ud851/lessons..)
      query=     query is used to filter the resource.
      fragment=  fragment contains data used by path of query.
## Rules for building legitmate URI:
      Scheme is followed by ":" character.
      authority is preceded by //.
      depending on scheme authority is optional.
      if authority is present than path should be preceded by "/" ,otherwise its optional.
      query should be preceded by ?. query is optional.
      fragment should be preceded by #.
      
generally be build URI using UriBuilder class because its relieves us of caring about the character rules ,the class does it for us.
URL is a subset of URI.
## Geo URI:
      one other type of URI is geo URI.
      geo URI has scheme geo:
      geo:0,0?q=Antwarp,Belgium & Z=10  is the example of geo URI.
      in above URI example geo is scheme ,geo scheme describes that the resource/data type to which this URI points is a physical location.
      in above example scheme geo: is followed by path 0,0 . 0,0 is latitude and longitude .its 0,0 because according to rules if
      we decribe a string address than lat and long should be 0,0.    
      their is not authority in above example because we don't need it also authority is optional.


      
