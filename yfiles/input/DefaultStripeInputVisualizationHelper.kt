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
import yfiles.graph.IStripe
import yfiles.lang.ClassMetadata
import yfiles.view.IVisualCreator
import yfiles.view.IVisualTemplate
import yfiles.view.ResourceKey

/**
 * Default implementation of [IStripeInputVisualizationHelper] that uses [IVisualTemplate]s for the actual visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultStripeInputVisualizationHelper">Online Documentation</a>
 * 
 * @constructor Default constructor
 * @param [stripe] The stripe for which the visualizations are intended
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultStripeInputVisualizationHelper%23DefaultStripeInputVisualizationHelper-constructor-DefaultStripeInputVisualizationHelper">Online Documentation</a>
 */
external open class DefaultStripeInputVisualizationHelper  ( stripe: IStripe ) : IStripeInputVisualizationHelper {

/**
 * Gets or sets the [IVisualTemplate] that is used to visualize the current source of a stripe reparent operation.
 * @see [getVisualCreator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultStripeInputVisualizationHelper%23dragSourceStripeTemplate">Online Documentation</a>
 */
final var dragSourceStripeTemplate: IVisualTemplate<IStripe>?
/**
 * Gets or sets the [IVisualTemplate] that is used to visualize the current target of a stripe reparent operation.
 * @see [getVisualCreator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultStripeInputVisualizationHelper%23dropTargetStripeTemplate">Online Documentation</a>
 */
final var dropTargetStripeTemplate: IVisualTemplate<IStripe>?
/**
 * Gets or sets the [IVisualTemplate] that is used to visualize the current stripe resize operation.
 * @see [getVisualCreator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultStripeInputVisualizationHelper%23resizeStripeTemplate">Online Documentation</a>
 */
final var resizeStripeTemplate: IVisualTemplate<IStripe>?
/**
 * Gets or sets the [IVisualTemplate] that is used to visualize the current stripe selection operation.
 * @see [getVisualCreator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultStripeInputVisualizationHelper%23selectedStripeTemplate">Online Documentation</a>
 */
final var selectedStripeTemplate: IVisualTemplate<IStripe>?
/**
 * Provide a [IVisualTemplate] that is used to visualize `type`.
 * @param [context] The input mode context. Allows you to access the [CanvasComponent][yfiles.view.CanvasComponent] to retrieve the resources.
 * @param [type] The visualization type
 * @return A [IVisualTemplate] that is used to visualize `type`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultStripeInputVisualizationHelper%23DefaultStripeInputVisualizationHelper-method-findTemplate">Online Documentation</a>
 */
 open protected   fun findTemplate( context: IInputModeContext ,
 type: StripeVisualizationType ):IVisualTemplate<IStripe>?
/**
 * Return an [IVisualCreator] that is used to visualize the input operation specified by `type`.
 * @param [context] The input mode context which provides further information.
 * @param [tableNode] The node where the stripe's owner is currently bound to.
 * @param [type] The actual visualization type
 * @return A [IVisualCreator] instance that renders a representation for the current operation.
 * @see [resizeStripeTemplate]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultStripeInputVisualizationHelper%23DefaultStripeInputVisualizationHelper-method-getVisualCreator">Online Documentation</a>
 */
 final override   fun getVisualCreator( context: IInputModeContext ,
 tableNode: INode ,
 type: StripeVisualizationType ):IVisualCreator

companion object : ClassMetadata<DefaultStripeInputVisualizationHelper> {
/**
 * A [String] that can be used to store a [IVisualTemplate] that can be used to create the visual that will be used to draw the highlight for the current source of a stripe reparent operation.
 * @see [getVisualCreator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultStripeInputVisualizationHelper%23DRAG_SOURCE_STRIPE_TEMPLATE_KEY">Online Documentation</a>
 */
 val DRAG_SOURCE_STRIPE_TEMPLATE_KEY: ResourceKey<IVisualTemplate<IStripe>>
/**
 * A [String] that can be used to store a [IVisualTemplate] that can be used to create the visual that will be used to draw the highlight for the current target of a stripe reparent operation.
 * @see [getVisualCreator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultStripeInputVisualizationHelper%23DROP_TARGET_STRIPE_TEMPLATE_KEY">Online Documentation</a>
 */
 val DROP_TARGET_STRIPE_TEMPLATE_KEY: ResourceKey<IVisualTemplate<IStripe>>
/**
 * A [String] that can be used to store a [IVisualTemplate] that can be used to create the visual that will be used to draw the highlight for the stripe that is resized.
 * @see [getVisualCreator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultStripeInputVisualizationHelper%23RESIZE_STRIPE_TEMPLATE_KEY">Online Documentation</a>
 */
 val RESIZE_STRIPE_TEMPLATE_KEY: ResourceKey<IVisualTemplate<IStripe>>
/**
 * A [String] that can be used to store a [IVisualTemplate] that can be used to create the visual that will be used to draw the highlight for the stripe that is selected.
 * @see [getVisualCreator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultStripeInputVisualizationHelper%23SELECTED_STRIPE_TEMPLATE_KEY">Online Documentation</a>
 */
 val SELECTED_STRIPE_TEMPLATE_KEY: ResourceKey<IVisualTemplate<IStripe>>
}
}
