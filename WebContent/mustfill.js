function mustfill()
{ 
   if( document.index.user.value == "" )
   {
     alert( "Please provide your Name!" );
     document.index.user.focus();
     return false;
   }
   else if( document.index.pass.value == "" )
   {
     alert( "Please provide your Password!" );
     document.index.pass.focus() ;
     return false;
   }
    return( true );
}