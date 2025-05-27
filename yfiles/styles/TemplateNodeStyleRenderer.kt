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
import yfiles.geometry.IRectangle
import yfiles.geometry.Insets
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.graph.IContextLookup
import yfiles.graph.ILookup
import yfiles.graph.INode
import yfiles.input.IHitTestable
import yfiles.input.IInputModeContext
import yfiles.input.ILassoTestable
import yfiles.input.IMarqueeTestable
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.view.IBoundsProvider
import yfiles.view.ICanvasContext
import yfiles.view.IRenderContext
import yfiles.view.IVisibilityTestable
import yfiles.view.IVisualCreator
import yfiles.view.Visual

/**
 * An implementation of the [INodeStyleRenderer] interface that can render [TemplateNodeStyleBase] instances.
 * @see [TemplateNodeStyle]
 * @see [StringTemplateNodeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer">Online Documentation</a>
 */
external open class TemplateNodeStyleRenderer  : INodeStyleRenderer, IShapeGeometry, IBoundsProvider, IVisibilityTestable, IMarqueeTestable, ILassoTestable, IHitTestable, ILookup, IVisualCreator {

/**
 * Gets the [INode.layout] of the node this renderer is currently configured for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23layout">Online Documentation</a>
 */
final val layout: IRectangle
/**
 * Gets or sets the currently configured node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23node">Online Documentation</a>
 */
protected final var node: INode
/**
 * Gets or sets the currently configured style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23style">Online Documentation</a>
 */
protected final var style: TemplateNodeStyleBase
/**
 * Prepares this instance for subsequent calls after the style and node have been initialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-configure">Online Documentation</a>
 */
 open protected   fun configure()
/**
 * Creates the visual by delegating to [TemplateNodeStyleBase.createTemplate] and then initializing the control with the context.
 * @param [context] The context for the creation.
 * @return The visual that is used for rendering the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-createVisual">Online Documentation</a>
 */
 override   fun createVisual( context: IRenderContext ):Visual?
/**
 * Returns the layout bounds as an upper bound for the painting bound.
 * @param [context] the context to calculate the bounds for
 * @return the bounds or `null` to indicate an unbound area
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-getBounds">Online Documentation</a>
 */
 override   fun getBounds( context: ICanvasContext ):Rect
/**
 * Provides a [bounds calculation][IBoundsProvider] implementation for the given style and node.
 * @param [node] The node to query the provider for.
 * @param [style] The style whose provider is queried.
 * @return An implementation that can calculate visual bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-getBoundsProvider">Online Documentation</a>
 */
 override   fun getBoundsProvider( node: INode ,
 style: INodeStyle ):IBoundsProvider
/**
 * Configures the `style` and `node` parameters, does **not** call [configure] and returns `this`.
 * @param [node] The node to query the context for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [lookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-getContext">Online Documentation</a>
 */
 override   fun getContext( node: INode ,
 style: INodeStyle ):ILookup
/**
 * Gets the context by delegating to [TemplateNodeStyleBase.contextLookup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-getContextLookup">Online Documentation</a>
 */
 open protected   fun getContextLookup( style: TemplateNodeStyleBase ):IContextLookup<INode>
/**
 * Get the CSS class that is currently used by this renderer.
 * @return The CSS class that is currently used by this renderer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-getCssClass">Online Documentation</a>
 */
 open protected   fun getCssClass():String
/**
 * Provides a [hit testing][IHitTestable] implementation for the given style and node.
 * @param [node] The node to query the tester for.
 * @param [style] The style whose tester is queried.
 * @return An implementation that can perform the hit testing.
 * @see [isHit]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-getHitTestable">Online Documentation</a>
 */
 override   fun getHitTestable( node: INode ,
 style: INodeStyle ):IHitTestable
/**
 * Gets the insets by delegating to [TemplateNodeStyleBase.insets].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-getInsets">Online Documentation</a>
 */
 open protected   fun getInsets( style: TemplateNodeStyleBase ):Insets
/**
 * Tries to use the [outline shape][getNormalizedOutline] to perform the intersection calculation, otherwise reverts to default (rectangular) behavior.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-getIntersection">Online Documentation</a>
 */
 override   fun getIntersection( inner: Point ,
 outer: Point ):Point?
/**
 * Provides a [marquee testing][IMarqueeTestable] implementation for the given style and node.
 * @param [node] The node to query the tester for.
 * @param [style] The style whose tester is queried.
 * @return An implementation that can test for marquee intersections.
 * @see [isInBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
 */
 override   fun getMarqueeTestable( node: INode ,
 style: INodeStyle ):IMarqueeTestable
/**
 * Gets the minimum size by delegating to [TemplateNodeStyleBase.minimumSize].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-getMinimumSize">Online Documentation</a>
 */
 open protected   fun getMinimumSize( style: TemplateNodeStyleBase ):Size
/**
 * Gets the normalized outline by delegating to [TemplateNodeStyleBase.normalizedOutline].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-getNormalizedOutline">Online Documentation</a>
 */
 open protected   fun getNormalizedOutline( style: TemplateNodeStyleBase ):GeneralPath?
/**
 * Tries to use the [outline shape][getNormalizedOutline] to create the outline shape path, otherwise reverts to default (rectangular) behavior.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-getOutline">Online Documentation</a>
 */
 override   fun getOutline():GeneralPath?
/**
 * Provides the geometry for the visual representation.
 * @param [node] The node to query the geometry for.
 * @param [style] The style for which the geometry is queried.
 * @return An implementation that describes the outline geometry of the shape.
 * @see [isInside]
 * @see [getOutline]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-getShapeGeometry">Online Documentation</a>
 */
 override   fun getShapeGeometry( node: INode ,
 style: INodeStyle ):IShapeGeometry
/**
 * Configures the `style` and `node` parameters, does **not** call [configure] and returns `this`.
 * @param [node] The node to query visibility tests. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [isVisible]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
 */
 override   fun getVisibilityTestable( node: INode ,
 style: INodeStyle ):IVisibilityTestable
/**
 * Configures the `style` and `node` parameters, calls [configure] and returns `this`.
 * @param [node] The node to retrieve the [IVisualCreator] for. The value will be stored in the [node] property.
 * @param [style] The style to associate with the node. The value will be stored in the [style] property.
 * @return `this`
 * @see [createVisual]
 * @see [updateVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
 override   fun getVisualCreator( node: INode ,
 style: INodeStyle ):IVisualCreator
/**
 * Tries to use the [outline shape][getNormalizedOutline] to perform the hit test analysis, otherwise reverts to default (rectangular) behavior.
 * @param [context] the context the hit test is performed in
 * @param [location] the hit point in world coordinates
 * @return whether something has been hit
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-isHit">Online Documentation</a>
 */
 override   fun isHit( context: IInputModeContext ,
 location: Point ):Boolean
/**
 * Tries to use the [outline shape][getNormalizedOutline] to perform the marquee intersection analysis, otherwise reverts to default (rectangular) behavior.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-isInBox">Online Documentation</a>
 */
 override   fun isInBox( context: IInputModeContext ,
 rectangle: Rect ):Boolean
/**
 * Tries to use the [outline shape][getNormalizedOutline] to perform the lasso intersection analysis, otherwise reverts to default (rectangular) behavior.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-isInPath">Online Documentation</a>
 */
 override   fun isInPath( context: IInputModeContext ,
 lassoPath: GeneralPath ):Boolean
/**
 * Tries to use the [outline shape][getNormalizedOutline] to perform the contains test, otherwise reverts to default (rectangular) behavior.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-isInside">Online Documentation</a>
 */
 override   fun isInside( location: Point ):Boolean
/**
 * Determines visibility by checking for an intersection with the [layout].
 * @param [context] The context.
 * @param [rectangle] The current clip
 * @return Whether the [layout] is visible in the clip.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-isVisible">Online Documentation</a>
 */
 override   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ):Boolean
/**
 * Implementation of the [ILookup.lookup] method.
 * @param [type] The type to query an instance for.
 * @return The implementation or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * Updates the component correspondingly.
 * @param [context] The context for the creation.
 * @param [oldVisual] The currently rendered visual.
 * @return The visual that is used for rendering the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateNodeStyleRenderer%23TemplateNodeStyleRenderer-method-updateVisual">Online Documentation</a>
 */
 override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<TemplateNodeStyleRenderer> {
}
}
