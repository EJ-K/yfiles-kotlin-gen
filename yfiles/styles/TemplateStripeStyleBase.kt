// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.graph.IContextLookup
import yfiles.graph.IStripe
import yfiles.lang.ClassMetadata
import yfiles.lang.IPropertyObservable
import yfiles.lang.PropertyChangedEventArgs
import yfiles.lang.PropertyChangedEventHandler
import yfiles.view.IRenderContext
import yfiles.view.SvgVisual

/**
 * Base class for stripe styles that use a SVG snippet as template for the visualization of [IStripe]s.
 * @see [TemplateStripeStyle]
 * @see [StringTemplateStripeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleBase">Online Documentation</a>
 * 
 * @constructor Constructs a new instance using the provided `renderer`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleBase%23TemplateStripeStyleBase-constructor-TemplateStripeStyleBase(TemplateStripeStyleRenderer)">Online Documentation</a>
 * 
 * @property renderer
 * Convenience getter that yields the [TemplateStripeStyleRenderer] that is used by this instance.
 * @see [IStripeStyle.renderer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleBase%23renderer">Online Documentation</a>
 */
external abstract class TemplateStripeStyleBase 
protected constructor (
final override val renderer: TemplateStripeStyleRenderer = definedExternally) : IStripeStyle, IPropertyObservable {

/**
 * Gets or sets an implementation of [IContextLookup] that can be used to satisfy queries that are made to the implementation which is returned by calls to [IStripeStyleRenderer.getContext] that are made on the style renderer that is associated with this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleBase%23contextLookup">Online Documentation</a>
 */
final var contextLookup: IContextLookup<IStripe>
/**
 * Gets or sets the tag that is associated with this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleBase%23styleTag">Online Documentation</a>
 */
final var styleTag: StyleTag?
/**
 * Performs a shallow clone of this instance, except for the value of [styleTag] which is cloned, too, if it can be cloned.
 * @return A clone of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleBase%23TemplateStripeStyleBase-method-clone">Online Documentation</a>
 */
 override   fun clone():TemplateStripeStyleBase
/**
 * Factory method that is called by the [TemplateStripeStyleRenderer] to create the visual that will be used for the display of the stripe.
 * @param [context] The context for which the visual should be created.
 * @param [stripe] The stripe that will be rendered.
 * @return The readily styled visual.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleBase%23TemplateStripeStyleBase-method-createTemplate">Online Documentation</a>
 */
 open   fun createTemplate( context: IRenderContext ,
 stripe: IStripe ):SvgVisual
/**
 * Raises the [PropertyChanged] event.
 * @param [event] The [PropertyChangedEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleBase%23TemplateStripeStyleBase-method-onPropertyChanged">Online Documentation</a>
 */
 open protected   fun onPropertyChanged( event: PropertyChangedEventArgs )
/**
 * Occurs when a property value changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateStripeStyleBase%23PropertyChanged">Online Documentation</a>
 */
override fun addPropertyChangedListener(listener: PropertyChangedEventHandler)
override fun removePropertyChangedListener(listener: PropertyChangedEventHandler)

companion object : ClassMetadata<TemplateStripeStyleBase> {
}
}
