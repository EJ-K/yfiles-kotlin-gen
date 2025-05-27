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
import yfiles.geometry.Insets
import yfiles.geometry.Size
import yfiles.graph.IContextLookup
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.IPropertyObservable
import yfiles.lang.PropertyChangedEventArgs
import yfiles.lang.PropertyChangedEventHandler
import yfiles.view.IRenderContext
import yfiles.view.SvgVisual

/**
 * Base class for node styles that use a SVG snippet as template for the visualization of [INode]s.
 * @see [TemplateNodeStyle]
 * @see [StringTemplateNodeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleBase">Online Documentation</a>
 * 
 * @constructor Constructs a new instance.
 * @param [renderer] The renderer to use with this instance. If no renderer is provided a default instance is used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleBase%23TemplateNodeStyleBase-constructor-TemplateNodeStyleBase">Online Documentation</a>
 * 
 * @property renderer
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleBase%23renderer">Online Documentation</a>
 */
external abstract class TemplateNodeStyleBase 
protected constructor (
final override val renderer: TemplateNodeStyleRenderer = definedExternally) : INodeStyle, IPropertyObservable {

/**
 * Gets or sets an implementation of [IContextLookup] that can be used to satisfy queries that are made to the implementation which is returned by calls to [INodeStyleRenderer.getContext] that are made on the style renderer that is associated with this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleBase%23contextLookup">Online Documentation</a>
 */
final var contextLookup: IContextLookup<INode>
/**
 * Gets or sets an additional CSS class that will be added to the template's root element.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleBase%23cssClass">Online Documentation</a>
 */
final var cssClass: String
/**
 * Gets or sets the insets the [INodeInsetsProvider][yfiles.input.INodeInsetsProvider] implementation for [INode] should yield for this instance.
 * @see [INodeInsetsProvider][yfiles.input.INodeInsetsProvider]
 * @see [INodeStyleRenderer.getContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleBase%23insets">Online Documentation</a>
 */
final var insets: Insets
/**
 * Gets or sets the minimum size an [INodeSizeConstraintProvider][yfiles.input.INodeSizeConstraintProvider] implementation for [INode] should yield.
 * 
 * The default value is [Size.EMPTY].
 * @see [INodeSizeConstraintProvider][yfiles.input.INodeSizeConstraintProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleBase%23minimumSize">Online Documentation</a>
 */
final var minimumSize: Size
/**
 * Gets or sets the normalized outline of a node that will be displayed using the [created visual][createTemplate].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleBase%23normalizedOutline">Online Documentation</a>
 */
final var normalizedOutline: GeneralPath?
/**
 * Gets or sets the tag that is associated with this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleBase%23styleTag">Online Documentation</a>
 */
final var styleTag: StyleTag?
/**
 * Performs a shallow clone of this instance, except for the value of [styleTag] which is cloned, too, if it can be cloned.
 * @return A clone of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleBase%23TemplateNodeStyleBase-method-clone">Online Documentation</a>
 */
 override   fun clone():TemplateNodeStyleBase
/**
 * Factory method that is called by the [TemplateNodeStyleRenderer] to create the visual that will be used for the display of the node.
 * @param [context] The context for which the visual should be created.
 * @param [node] The node that will be rendered.
 * @return The readily styled visual.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleBase%23TemplateNodeStyleBase-method-createTemplate">Online Documentation</a>
 */
 open   fun createTemplate( context: IRenderContext ,
 node: INode ):SvgVisual
/**
 * Raises the [PropertyChanged] event.
 * @param [event] The [PropertyChangedEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleBase%23TemplateNodeStyleBase-method-onPropertyChanged">Online Documentation</a>
 */
 open protected   fun onPropertyChanged( event: PropertyChangedEventArgs )
/**
 * Occurs when a property value changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleBase%23PropertyChanged">Online Documentation</a>
 */
override fun addPropertyChangedListener(listener: PropertyChangedEventHandler)
override fun removePropertyChangedListener(listener: PropertyChangedEventHandler)

companion object : ClassMetadata<TemplateNodeStyleBase> {
}
}
