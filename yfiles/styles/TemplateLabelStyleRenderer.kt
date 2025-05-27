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
import yfiles.geometry.IOrientedRectangle
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.graph.ILabel
import yfiles.graph.ILookup
import yfiles.input.IHitTestable
import yfiles.input.IInputModeContext
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
 * An implementation of the [ILabelStyleRenderer] interface that can render [TemplateLabelStyleBase] instances.
 * @see [TemplateLabelStyle]
 * @see [StringTemplateLabelStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer">Online Documentation</a>
 */
external open class TemplateLabelStyleRenderer  : ILabelStyleRenderer, IVisualCreator, IBoundsProvider, IHitTestable, IMarqueeTestable, IVisibilityTestable, ILookup {

/**
 * Gets or sets the currently configured label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23label">Online Documentation</a>
 */
protected final var label: ILabel
/**
 * Gets the layout of the current label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23layout">Online Documentation</a>
 */
protected final val layout: IOrientedRectangle
/**
 * Gets or sets the currently configured style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23style">Online Documentation</a>
 */
protected final var style: TemplateLabelStyleBase
/**
 * Stores the [layout][ILabel.layout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-configure">Online Documentation</a>
 */
 open protected   fun configure()
/**
 * Creates the visual by delegating to [TemplateLabelStyleBase.createTemplate] and then initializing the control with the context.
 * @param [context] The context for the creation.
 * @return The visual that is used for rendering the label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-createVisual">Online Documentation</a>
 */
 override   fun createVisual( context: IRenderContext ):Visual?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-getBounds">Online Documentation</a>
 */
 override   fun getBounds( context: ICanvasContext ):Rect
/**
 * Configures the [style] and [label] properties, calls [configure] and returns `this`.
 * @param [label] The label to retrieve the bounds provider for. The value will be stored in the [label] property.
 * @param [style] The style to associate with the label. The value will be stored in the [style] property.
 * @return `this`
 * @see [getBounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-getBoundsProvider">Online Documentation</a>
 */
 override   fun getBoundsProvider( label: ILabel ,
 style: ILabelStyle ):IBoundsProvider
/**
 * Configures the [style] and [label] properties, does **not** call [configure] and returns `this`.
 * @param [label] The label to query the context for. The value will be stored in the [label] property.
 * @param [style] The style to associate with the label. The value will be stored in the [style] property.
 * @return `this`
 * @see [lookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-getContext">Online Documentation</a>
 */
 override   fun getContext( label: ILabel ,
 style: ILabelStyle ):ILookup
/**
 * Configures the [style] and [label] properties, calls [configure] and returns `this`.
 * @param [label] The label to query hit test with. The value will be stored in the [label] property.
 * @param [style] The style to associate with the label. The value will be stored in the [style] property.
 * @return `this`
 * @see [isHit]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-getHitTestable">Online Documentation</a>
 */
 override   fun getHitTestable( label: ILabel ,
 style: ILabelStyle ):IHitTestable
/**
 * Configures the [style] and [label] properties, calls [configure] and returns `this`.
 * @param [label] The label to query marquee intersection tests. The value will be stored in the [label] property.
 * @param [style] The style to associate with the label. The value will be stored in the [style] property.
 * @return `this`
 * @see [isInBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-getMarqueeTestable">Online Documentation</a>
 */
 override   fun getMarqueeTestable( label: ILabel ,
 style: ILabelStyle ):IMarqueeTestable
/**
 * Gets the normalized outline by delegating to [TemplateLabelStyleBase.normalizedOutline].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-getNormalizedOutline">Online Documentation</a>
 */
 open protected   fun getNormalizedOutline( style: TemplateLabelStyleBase ):GeneralPath?
/**
 * Calculates the preferred size for the given label and style.
 * @param [label] The label instance.
 * @param [style] The style instance to apply.
 * @return The preferred size for the given label and style.
 * @see [getPreferredSizeCore]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-getPreferredSize">Online Documentation</a>
 */
 override   fun getPreferredSize( label: ILabel ,
 style: ILabelStyle ):Size
/**
 * Gets the size of the preferred for the current configuration using the provided context.
 * @param [context] The render context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-getPreferredSizeCore">Online Documentation</a>
 */
 open protected   fun getPreferredSizeCore( context: IRenderContext? ):Size
/**
 * Calculates the preferred size for the given label and style.
 * @param [label] The label instance.
 * @param [style] The style instance to apply.
 * @return The preferred size for the given label and style.
 * @see [getPreferredSizeCore]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-getPreferredSizeWithContext">Online Documentation</a>
 */
 open   fun getPreferredSizeWithContext( context: IRenderContext? ,
 label: ILabel ,
 style: ILabelStyle ):Size
/**
 * Configures the [style] and [label] properties, does **not** call [configure] and returns `this`.
 * @param [label] The label to query visibility tests. The value will be stored in the [label] property.
 * @param [style] The style to associate with the label. The value will be stored in the [style] property.
 * @return `this`
 * @see [isVisible]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-getVisibilityTestable">Online Documentation</a>
 */
 override   fun getVisibilityTestable( label: ILabel ,
 style: ILabelStyle ):IVisibilityTestable
/**
 * Configures the [style] and [label] properties, calls [configure] and returns `this`.
 * @param [label] The label to retrieve the [IVisualCreator] for. The value will be stored in the [label] property.
 * @param [style] The style to associate with the label. The value will be stored in the [style] property.
 * @return `this`
 * @see [createVisual]
 * @see [updateVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-getVisualCreator">Online Documentation</a>
 */
 override   fun getVisualCreator( label: ILabel ,
 style: ILabelStyle ):IVisualCreator
/**
 * Delegates to the [TemplateLabelStyleBase]'s [TemplateLabelStyleBase.autoFlip] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-isAutoFlip">Online Documentation</a>
 */
 open protected   fun isAutoFlip( style: TemplateLabelStyleBase ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-isHit">Online Documentation</a>
 */
 override   fun isHit( context: IInputModeContext ,
 location: Point ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-isInBox">Online Documentation</a>
 */
 override   fun isInBox( context: IInputModeContext ,
 rectangle: Rect ):Boolean
/**
 * Uses the [layout][ILabel.layout] to determine whether the clip intersects.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-isVisible">Online Documentation</a>
 */
 override   fun isVisible( context: ICanvasContext ,
 rectangle: Rect ):Boolean
/**
 * Delegates to the [TemplateLabelStyleBase.contextLookup] of the [ILabelStyle].
 * @param [type] The type to query an instance for.
 * @return The implementation or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * Delegates to the [TemplateLabelStyleBase]'s [TemplateLabelStyleBase.contextLookup].
 * @param [style] The style to look up the context for.
 * @param [label] The current label.
 * @param [type] The type to look up.
 * @return The result from the context or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-lookupContext">Online Documentation</a>
 */
 open protected   fun <T : YObject>lookupContext( style: TemplateLabelStyleBase ,
 label: ILabel ,
 type: YClass<T> ):T?
/**
 * Updates the visual correspondingly.
 * @param [context] The context for the creation.
 * @param [oldVisual] The currently rendered visual.
 * @return The visual that is used for rendering the label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TemplateLabelStyleRenderer%23TemplateLabelStyleRenderer-method-updateVisual">Online Documentation</a>
 */
 override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<TemplateLabelStyleRenderer> {
}
}
