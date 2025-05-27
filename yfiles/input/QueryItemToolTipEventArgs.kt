// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata

/**
 * A specialized subclass of [ToolTipQueryEventArgs] that carries the [item] for which the tool tip is queried.
 * @param [TModelItem] The type of the [model item][item].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryItemToolTipEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [QueryItemToolTipEventArgs] class.
 * @param [context] The context to yield the tool tip for.
 * @param [queryLocation] The query location.
 * @param [item] The item for which the tool tip is queried..
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryItemToolTipEventArgs%23QueryItemToolTipEventArgs-constructor-QueryItemToolTipEventArgs">Online Documentation</a>
 * 
 * @property item
 * Gets the item for which the tool tip is queried.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryItemToolTipEventArgs%23item">Online Documentation</a>
 */
external open class QueryItemToolTipEventArgs<TModelItem : IModelItem>  (
 context: IInputModeContext ,
 queryLocation: Point ,
final val item: TModelItem?) : ToolTipQueryEventArgs {

companion object : ClassMetadata<QueryItemToolTipEventArgs<*>> {
}
}
