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
import yfiles.lang.IClassMetadata

/**
 * The event arguments used by [query-type][GraphMLIOHandler] to override automatic type resolution in GraphML.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryTypeEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [QueryTypeEventArgs] class.
 * @param [context] The context in which the lookup should take place.
 * @param [xmlName] The type that should be mapped.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryTypeEventArgs%23QueryTypeEventArgs-constructor-QueryTypeEventArgs">Online Documentation</a>
 * 
 * @property context
 * Gets the context in which the [Constructor] shall be mapped.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryTypeEventArgs%23context">Online Documentation</a>
 * 
 * @property xmlName
 * Gets the fully qualified XML name that should be resolved to a type.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryTypeEventArgs%23xmlName">Online Documentation</a>
 */
external class QueryTypeEventArgs (
final val context: IParseContext,
final val xmlName: XmlName) : EventArgs {
  /**
   * Gets or sets a value indicating whether this [QueryTypeEventArgs] is handled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryTypeEventArgs%23handled">Online Documentation</a>
   */
  final var handled: Boolean
  
  /**
   * Gets or sets the result of the type query, which is `null` initially.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryTypeEventArgs%23result">Online Documentation</a>
   */
  final var result: IClassMetadata<*>?
  
  companion object : ClassMetadata<QueryTypeEventArgs> {
  }
}
