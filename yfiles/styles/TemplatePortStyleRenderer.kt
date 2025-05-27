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
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.graph.ILookup
import yfiles.graph.IPort
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
 * An implementation of the [IPortStyleRenderer] interface that can render [TemplatePortStyleBase] instances.
 * @see [TemplatePortStyle]
 * @see [StringTemplatePortStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-constructor-TemplatePortStyleRenderer">Online Documentation</a>
 */
external open class TemplatePortStyleRenderer  () : IPortStyleRenderer, IBoundsProvider, IVisibilityTestable, IMarqueeTestable, ILassoTestable, IHitTestable, ILookup, IVisualCreator {

/**
 * Gets the center of the port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23center">Online Documentation</a>
 */
protected final val center: Point
/**
 * Gets or sets the currently configured port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23port">Online Documentation</a>
 */
protected final var port: IPort
/**
 * Gets or sets the currently configured style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23style">Online Documentation</a>
 */
protected final var style: TemplatePortStyleBase
/**
 * Prepares this instance for subsequent calls after the style and port have been initialized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-configure">Online Documentation</a>
 */
 open protected   fun configure()
/**
 * Creates the visual by delegating to [TemplatePortStyleBase.createTemplate] and then initializing the visual with the context.
 * @param [context] The context for the creation.
 * @return The visual that is used for rendering the port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-createVisual">Online Documentation</a>
 */
 override   fun createVisual( context: IRenderContext ):Visual?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-getBounds">Online Documentation</a>
 */
 override   fun getBounds( context: ICanvasContext ):Rect
/**
 * Configures the `style` and `port` parameters, calls [configure] and returns `this`.
 * @param [port] The port to retrieve the bounds provider for. The value will be stored in the [port] property.
 * @param [style] The style to associate with the port. The value will be stored in the [style] property.
 * @return `this`
 * @see [getBounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-getBoundsProvider">Online Documentation</a>
 */
 override   fun getBoundsProvider( port: IPort ,
 style: IPortStyle ):IBoundsProvider
/**
 * Configures the `style` and `port` parameters, does **not** call [configure] and returns `this`.
 * @param [port] The port to query the context for. The value will be stored in the [port] property.
 * @param [style] The style to associate with the port. The value will be stored in the [style] property.
 * @return `this`
 * @see [lookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-getContext">Online Documentation</a>
 */
 override   fun getContext( port: IPort ,
 style: IPortStyle ):ILookup
/**
 * Configures the `style` and `port` parameters, calls [configure] and returns `this`.
 * @param [port] The port to query hit test with. The value will be stored in the [port] property.
 * @param [style] The style to associate with the port. The value will be stored in the [style] property.
 * @return `this`
 * @see [isHit]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-getHitTestable">Online Documentation</a>
 */
 override   fun getHitTestable( port: IPort ,
 style: IPortStyle ):IHitTestable
/**
 * Configures the `style` and `port` parameters, calls [configure] and returns `this`.
 * @param [port] The port to query marquee intersection tests. The value will be stored in the [port] property.
 * @param [style] The style to associate with the port. The value will be stored in the [style] property.
 * @return `this`
 * @see [isInBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
 */
 override   fun getMarqueeTestable( port: IPort ,
 style: IPortStyle ):IMarqueeTestable
/**
 * Gets the normalized outline by delegating to [TemplatePortStyleBase.normalizedOutline].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-getNormalizedOutline">Online Documentation</a>
 */
 open protected   fun getNormalizedOutline( style: TemplatePortStyleBase ):GeneralPath?
/**
 * Gets the offset for the visualization.
 * @return The [TemplatePortStyleBase.offset].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-getOffset">Online Documentation</a>
 */
 open protected   fun getOffset():Point
/**
 * Gets the size of the rendering from the style.
 * @return The [TemplatePortStyleBase.renderSize].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-getRenderSize">Online Documentation</a>
 */
 open protected   fun getRenderSize():Size
/**
 * Configures the `style` and `port` parameters, does **not** call [configure] and returns `this`.
 * @param [port] The port to query visibility tests. The value will be stored in the [port] property.
 * @param [style] The style to associate with the port. The value will be stored in the [style] property.
 * @return `this`
 * @see [isVisible]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
 */
 override   fun getVisibilityTestable( port: IPort ,
 style: IPortStyle ):IVisibilityTestable
/**
 * Configures the `style` and `port` parameters, calls [configure] and returns `this`.
 * @param [port] The port to retrieve the [IVisualCreator] for. The value will be stored in the [port] property.
 * @param [style] The style to associate with the port. The value will be stored in the [style] property.
 * @return `this`
 * @see [createVisual]
 * @see [updateVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
 override   fun getVisualCreator( port: IPort ,
 style: IPortStyle ):IVisualCreator
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-isHit">Online Documentation</a>
 */
 override   fun isHit( context: IInputModeContext ,
 location: Point ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-isInBox">Online Documentation</a>
 */
 override   fun isInBox( context: IInputModeContext ,
 rectangle: Rect ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-isInPath">Online Documentation</a>
 */
 final override   fun isInPath( context: IInputModeContext ,
 lassoPath: GeneralPath ):Boolean
/**
 * Calls [configure] and test the [port] using the [style] for a visible intersection with the clip bounds.
 * @param [context] the current canvas context
 * @param [rectangle] the clip bounds
 * @return `true` if the port may be painted within the clip bounds.
 * @see [getVisibilityTestable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-isVisible">Online Documentation</a>
 */
 override   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ):Boolean
/**
 * Implements the [ILookup] interface.
 * @param [type] The type to query for.
 * @return An implementation or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * Delegates to the [TemplatePortStyleBase]'s [TemplatePortStyleBase.contextLookup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-lookupContext">Online Documentation</a>
 */
 open protected   fun <T : YObject>lookupContext( style: TemplatePortStyleBase ,
 port: IPort ,
 type: YClass<T> ):T?
/**
 * Updates the visual correspondingly.
 * @param [context] The context for the creation.
 * @param [oldVisual] The currently rendered visual.
 * @return The visual that is used for rendering the port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplatePortStyleRenderer%23TemplatePortStyleRenderer-method-updateVisual">Online Documentation</a>
 */
 override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<TemplatePortStyleRenderer> {
}
}
