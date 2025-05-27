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
import yfiles.geometry.Size
import yfiles.graph.IContextLookup
import yfiles.graph.ILabel
import yfiles.lang.ClassMetadata
import yfiles.lang.IPropertyObservable
import yfiles.lang.PropertyChangedEventArgs
import yfiles.lang.PropertyChangedEventHandler
import yfiles.view.IRenderContext
import yfiles.view.SvgVisual

/**
 * Base class for label styles that use a SVG snippet as template for the visualization of [ILabel]s.
 * @see [TemplateLabelStyle]
 * @see [StringTemplateLabelStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleBase">Online Documentation</a>
 * 
 * @constructor Constructs a new instance using the provided `renderer`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleBase%23TemplateLabelStyleBase-constructor-TemplateLabelStyleBase(TemplateLabelStyleRenderer)">Online Documentation</a>
 */
external abstract class TemplateLabelStyleBase  ( renderer: TemplateLabelStyleRenderer?  = definedExternally) : ILabelStyle, IPropertyObservable {

/**
 * Gets or sets a value indicating whether the rendering should automatically be flipped (rotated by 180 degrees) if otherwise it would be rendered upside-down.
 * 
 * The default value is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleBase%23autoFlip">Online Documentation</a>
 */
final var autoFlip: Boolean
/**
 * Gets or sets an implementation of [IContextLookup] that can be used to satisfy queries that are made to the implementation which is returned by calls to [ILabelStyleRenderer.getContext] that are made on the style renderer that is associated with this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleBase%23contextLookup">Online Documentation</a>
 */
final var contextLookup: IContextLookup<ILabel>
/**
 * Gets or sets an additional CSS class that will be added to the template's root element.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleBase%23cssClass">Online Documentation</a>
 */
final var cssClass: String
/**
 * Gets or sets the normalized outline of a label that will be displayed using the [created visual][createTemplate].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleBase%23normalizedOutline">Online Documentation</a>
 */
final var normalizedOutline: GeneralPath?
/**
 * Gets or sets the preferred size of the labels that use this style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleBase%23preferredSize">Online Documentation</a>
 */
final var preferredSize: Size
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleBase%23renderer">Online Documentation</a>
 */
final override val renderer: TemplateLabelStyleRenderer
/**
 * Gets or sets the tag that is associated with this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleBase%23styleTag">Online Documentation</a>
 */
final var styleTag: StyleTag?
/**
 * Performs a shallow clone of this instance, except for the value of [styleTag] which is cloned, too, if it can be cloned.
 * @return A clone of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleBase%23TemplateLabelStyleBase-method-clone">Online Documentation</a>
 */
 override   fun clone():TemplateLabelStyleBase
/**
 * Factory method that is called by the [TemplateLabelStyleRenderer] to create the visual that will be used for the display of the label.
 * @param [context] The context for which the visual should be created.
 * @param [label] The label that will be rendered.
 * @return The readily styled visual.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleBase%23TemplateLabelStyleBase-method-createTemplate">Online Documentation</a>
 */
 open   fun createTemplate( context: IRenderContext ,
 label: ILabel ):SvgVisual
/**
 * Determines the preferred size of the label if this style was applied.
 * @param [context] The context for which the size should be calculated.
 * @param [label] The label to determine the preferred size of.
 * @return The preferred size.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleBase%23TemplateLabelStyleBase-method-getPreferredSize">Online Documentation</a>
 */
 open   fun getPreferredSize( context: IRenderContext? ,
 label: ILabel ):Size
/**
 * Raises the [PropertyChanged] event.
 * @param [event] The [PropertyChangedEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleBase%23TemplateLabelStyleBase-method-onPropertyChanged">Online Documentation</a>
 */
 open protected   fun onPropertyChanged( event: PropertyChangedEventArgs )
/**
 * Occurs when a property value changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleBase%23PropertyChanged">Online Documentation</a>
 */
override fun addPropertyChangedListener(listener: PropertyChangedEventHandler)
override fun removePropertyChangedListener(listener: PropertyChangedEventHandler)

companion object : ClassMetadata<TemplateLabelStyleBase> {
}
}
