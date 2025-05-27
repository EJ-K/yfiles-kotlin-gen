// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StringTemplateNodeStyle">Online Documentation</a>
 */
@JsName("StringTemplateNodeStyle")
external object Templates {
/**
 * Gets the storage object for binding converters.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StringTemplateNodeStyle%23CONVERTERS">Online Documentation</a>
 */
 val CONVERTERS: Converters
/**
 * Specifies whether code contained in the templates should be included in the DOM.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StringTemplateNodeStyle%23trusted">Online Documentation</a>
 */
final var trusted: Boolean
/**
 * Makes an object observable to bindings in template styles.
 * @param [dataObject] The object to make observable.
 * @return The object that was passed in.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StringTemplateNodeStyle%23StringTemplateNodeStyle-method-makeObservable">Online Documentation</a>
 */
 final internal   fun <T : Any>makeObservable( dataObject: T ):T
}
