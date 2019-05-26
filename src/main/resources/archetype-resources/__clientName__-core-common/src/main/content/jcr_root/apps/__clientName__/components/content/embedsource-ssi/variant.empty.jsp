#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
<c:if test="${symbol_dollar}{WCMMODE_EDIT == CURRENT_WCMMODE}">
    ${symbol_dollar}{DEFAULT_CLASSIC_PLACEHOLDER_TEXT}
</c:if>
