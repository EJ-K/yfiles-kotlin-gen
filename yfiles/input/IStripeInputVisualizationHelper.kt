// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.graph.INode
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject
import yfiles.view.IVisualCreator

/**
 * This interface allows to change the visualization for different input gestures.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeInputVisualizationHelper">Online Documentation</a>
 */
external interface IStripeInputVisualizationHelper : YObject {
/**
 * Return an [IVisualCreator] that is used to visualize the input operation specified by `type`.
 * @param [context] The input mode context which provides further information.
 * @param [tableNode] The node where the stripe's owner is currently bound to.
 * @param [type] The actual visualization type
 * @return A [IVisualCreator] instance that renders a representation for the current operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeInputVisualizationHelper%23IStripeInputVisualizationHelper-method-getVisualCreator">Online Documentation</a>
 */
   fun getVisualCreator( context: IInputModeContext ,
 tableNode: INode ,
 type: StripeVisualizationType ):IVisualCreator

companion object : InterfaceMetadata<IStripeInputVisualizationHelper> {

/**
 * Creates an implementation of the interface [IStripeInputVisualizationHelper] by using the given function as implementation for its [getVisualCreator] method.
 * @param [getVisualCreator] A function for [IStripeInputVisualizationHelper]'s single abstract method [getVisualCreator].
 * @return An instance of the [IStripeInputVisualizationHelper] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IStripeInputVisualizationHelper%23IStripeInputVisualizationHelper-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun  invoke(
                getVisualCreator: (
            context: IInputModeContext,
tableNode: INode,
type: StripeVisualizationType
            ) -> IVisualCreator 
            ):IStripeInputVisualizationHelper
}
}
