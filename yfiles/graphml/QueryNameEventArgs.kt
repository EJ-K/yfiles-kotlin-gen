// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs
import yfiles.lang.YClass

/**
 * The event arguments used by [GraphMLIOHandler.QueryName] to override automatic name determination in GraphML.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryNameEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [QueryNameEventArgs] class.
 * @param [context] The context in which the lookup shall take place.
 * @param [type] The type that should be mapped.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryNameEventArgs%23QueryNameEventArgs-constructor-QueryNameEventArgs">Online Documentation</a>
 * 
 * @property context
 * Gets the context in which the [type] shall mapped.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryNameEventArgs%23context">Online Documentation</a>
 * 
 * @property type
 * Gets the type for which the [XML name][result] is queried.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryNameEventArgs%23type">Online Documentation</a>
 */
external open class QueryNameEventArgs  (
final val context: IWriteContext,
final val type: YClass<*>) : EventArgs {

/**
 * Gets or sets a value indicating whether this [QueryNameEventArgs] is handled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryNameEventArgs%23handled">Online Documentation</a>
 */
final var handled: Boolean
/**
 * Gets or sets the result of the name query, which is `null` initially.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryNameEventArgs%23result">Online Documentation</a>
 */
final var result: XmlName?

companion object : ClassMetadata<QueryNameEventArgs> {
}
}
