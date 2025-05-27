// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.IRectangle
import yfiles.graph.IContextLookup
import yfiles.graph.ILookup
import yfiles.graph.IStripe
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.view.IRenderContext
import yfiles.view.IVisualCreator
import yfiles.view.Visual

/**
 * An implementation of the [IStripeStyleRenderer] interface that can render [TemplateStripeStyle] instances.
 * @see [TemplateStripeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleRenderer">Online Documentation</a>
 */
external open class TemplateStripeStyleRenderer  : IStripeStyleRenderer, ILookup, IVisualCreator {

/**
 * Gets the [IStripe.layout] of the stripe this renderer is currently configured for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleRenderer%23layout">Online Documentation</a>
 */
final val layout: IRectangle
/**
 * Gets or sets the currently configured stripe.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleRenderer%23stripe">Online Documentation</a>
 */
protected final var stripe: IStripe
/**
 * Gets or sets the currently configured style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleRenderer%23style">Online Documentation</a>
 */
protected final var style: TemplateStripeStyleBase
/**
 * Prepares this instance for subsequent calls after the style and stripe have been initialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleRenderer%23TemplateStripeStyleRenderer-method-configure">Online Documentation</a>
 */
 open protected   fun configure()
/**
 * Creates the visual by delegating to [TemplateStripeStyleBase.createTemplate] and then initializing the control with the context.
 * @param [context] The context for the creation.
 * @return The control that is used for rendering the stripe.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleRenderer%23TemplateStripeStyleRenderer-method-createVisual">Online Documentation</a>
 */
 override   fun createVisual( context: IRenderContext ):Visual?
/**
 * Configures the `style` and `stripe` parameters, does **not** call [configure] and returns `this`.
 * @param [stripe] The stripe to query the context for. The value will be stored in the [stripe] property.
 * @param [style] The style to associate with the stripe. The value will be stored in the [style] property.
 * @return `this`
 * @see [lookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleRenderer%23TemplateStripeStyleRenderer-method-getContext">Online Documentation</a>
 */
 override   fun getContext( stripe: IStripe ,
 style: IStripeStyle ):ILookup
/**
 * Gets the context by delegating to [TemplateStripeStyleBase.contextLookup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleRenderer%23TemplateStripeStyleRenderer-method-getContextLookup">Online Documentation</a>
 */
 open protected   fun getContextLookup( style: TemplateStripeStyleBase ):IContextLookup<IStripe>
/**
 * Configures the `style` and `stripe` parameters, calls [configure] and returns `this`.
 * @param [stripe] The stripe to retrieve the [IVisualCreator] for. The value will be stored in the [stripe] property.
 * @param [style] The style to associate with the stripe. The value will be stored in the [style] property.
 * @return `this`
 * @see [createVisual]
 * @see [updateVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleRenderer%23TemplateStripeStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
 override   fun getVisualCreator( stripe: IStripe ,
 style: IStripeStyle ):IVisualCreator
/**
 * Implementation of the [ILookup.lookup] method.
 * @param [type] The type to query an instance for.
 * @return The implementation or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleRenderer%23TemplateStripeStyleRenderer-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * Updates the component correspondingly.
 * @param [context] The context for the creation.
 * @param [oldVisual] The currently rendered visual.
 * @return The control that is used for rendering the stripe.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleRenderer%23TemplateStripeStyleRenderer-method-updateVisual">Online Documentation</a>
 */
 override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<TemplateStripeStyleRenderer> {
}
}
