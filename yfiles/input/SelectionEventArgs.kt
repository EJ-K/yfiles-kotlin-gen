// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.view.ISelectionModel

/**
 * Event arguments that are used when modifying a [ISelectionModel]
 * @param [T] The type of the items in the [ISelectionModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionEventArgs">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @param [context] The context the event with these event args is dispatched.
 * @param [selection] The selection that is modified.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionEventArgs%23SelectionEventArgs-constructor-SelectionEventArgs">Online Documentation</a>
 * 
 * @property selection
 * Gets the selection these event arguments refer to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionEventArgs%23selection">Online Documentation</a>
 */
external open class SelectionEventArgs<T : IModelItem>  (
 context: IInputModeContext ,
final val selection: ISelectionModel<T>) : InputModeEventArgs {

companion object : ClassMetadata<SelectionEventArgs<*>> {
}
}
