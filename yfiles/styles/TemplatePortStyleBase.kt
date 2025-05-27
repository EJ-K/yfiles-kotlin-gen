// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.GeneralPath
import yfiles.geometry.Point
import yfiles.geometry.Size
import yfiles.graph.IContextLookup
import yfiles.graph.IPort
import yfiles.lang.ClassMetadata
import yfiles.lang.IPropertyObservable
import yfiles.lang.PropertyChangedEventArgs
import yfiles.lang.PropertyChangedEventHandler
import yfiles.view.IRenderContext
import yfiles.view.SvgVisual

/**
 * Base class for port styles that use a SVG snippet as template for the visualization of [IPort]s.
 * @see [TemplatePortStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleBase">Online Documentation</a>
 * 
 * @constructor Constructs a new instance using the provided `renderer`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleBase%23TemplatePortStyleBase-constructor-TemplatePortStyleBase">Online Documentation</a>
 * 
 * @property renderer
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleBase%23renderer">Online Documentation</a>
 */
external abstract class TemplatePortStyleBase 
protected constructor (
final override val renderer: TemplatePortStyleRenderer) : IPortStyle, IPropertyObservable {

/**
 * Gets or sets an implementation of [IContextLookup] that can be used to satisfy queries that are made to the implementation which is returned by calls to [IPortStyleRenderer.getContext] that are made on the style renderer that is associated with this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleBase%23contextLookup">Online Documentation</a>
 */
final var contextLookup: IContextLookup<IPort>
/**
 * Gets or sets an additional CSS class that will be added to the template's root element.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleBase%23cssClass">Online Documentation</a>
 */
final var cssClass: String
/**
 * Gets or sets a path that specifies the normalized outline of a port that will be displayed using the [created visual][createTemplate].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleBase%23normalizedOutline">Online Documentation</a>
 */
final var normalizedOutline: GeneralPath?
/**
 * Gets or sets an offset for the port visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleBase%23offset">Online Documentation</a>
 */
final var offset: Point
/**
 * Gets or sets the [size][Size] of the port that will be displayed using the [created visual][createTemplate].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleBase%23renderSize">Online Documentation</a>
 */
final var renderSize: Size
/**
 * Gets or sets the tag that is associated with this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleBase%23styleTag">Online Documentation</a>
 */
final var styleTag: StyleTag?
/**
 * Performs a shallow clone of this instance, except for the value of [styleTag] which is cloned, too, if it can be cloned.
 * @return A clone of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleBase%23TemplatePortStyleBase-method-clone">Online Documentation</a>
 */
 override   fun clone():TemplatePortStyleBase
/**
 * Factory method that is called by the [TemplatePortStyleRenderer] to create the visual that will be used for the display of the port.
 * @param [context] The context for which the visual should be created.
 * @param [port] The port that will be rendered.
 * @return The readily styled visual.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleBase%23TemplatePortStyleBase-method-createTemplate">Online Documentation</a>
 */
 open   fun createTemplate( context: IRenderContext ,
 port: IPort ):SvgVisual
/**
 * Raises the [PropertyChanged] event.
 * @param [event] The [PropertyChangedEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleBase%23TemplatePortStyleBase-method-onPropertyChanged">Online Documentation</a>
 */
 open protected   fun onPropertyChanged( event: PropertyChangedEventArgs )
/**
 * Occurs when a property value changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleBase%23PropertyChanged">Online Documentation</a>
 */
override fun addPropertyChangedListener(listener: PropertyChangedEventHandler)
override fun removePropertyChangedListener(listener: PropertyChangedEventHandler)

companion object : ClassMetadata<TemplatePortStyleBase> {
}
}
