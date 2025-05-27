// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import js.array.ReadonlyArray
import yfiles.collections.IEnumerable
import yfiles.geometry.Point
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.input.IHitTester
import yfiles.input.IInputModeContext
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.YClass
import yfiles.styles.IEdgeStyle
import yfiles.styles.ILabelStyle
import yfiles.styles.INodeStyle

/**
 * An alternative [GraphModelManager] implementation that supports WebGL2 for rendering and animating the graph's nodes, edges, and labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager">Online Documentation</a>
 * 
 * @constructor Creates a new instance of the [WebGL2GraphModelManager] class.
 * @see [install]
 * @see [uninstall]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-constructor-WebGL2GraphModelManager">Online Documentation</a>
 */
external open class WebGL2GraphModelManager  () : GraphModelManager, IEventDispatcher {

/**
 * Gets or sets the technology used to render the graph elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23renderMode">Online Documentation</a>
 */
final var renderMode: WebGL2GraphModelManagerRenderMode
/**
 * Creates an animation that animates the height of a [WebGL2ArcEdgeStyle] and [WebGL2BridgeEdgeStyle].
 * @param [timing] Specifies the timing function to use for the animation. Defaults to "1s linear 1 normal". The animation will loop once for [one second][yfiles.lang.TimeSpan] with a [linear][WebGL2AnimationEasing.LINEAR] progress in [normal][WebGL2AnimationDirection.NORMAL] direction.
 * @return An animation to assign to edges.
 * @see [setAnimations]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-createArcHeightAnimation">Online Documentation</a>
 */
 final   fun createArcHeightAnimation( timing: WebGL2AnimationTiming?  = definedExternally):WebGL2Animation
/**
 * Creates a beacon effect around nodes and edges.
 * @param [type] The type of beacon to apply. Defaults to [WebGL2BeaconAnimationType.FADE].
 * @param [color] The color of the beacon. Defaults to black if not specified.
 * @param [pulseWidth] The thickness of a single beacon pulse. Defaults to 4 pixels.
 * @param [pulseCount] How many beacon pulses should be simultaneously visible. Defaults to 1.
 * @param [pulseDistance] The distance between multiple beacon pulses. Defaults to 20 pixels.
 * @param [magnitude] The distance the beacon extends to. Defaults to 50.
 * @param [smooth] Whether to draw each pulse smoothly or with hard edges. Defaults to `true`.
 * @param [useViewCoordinates] Whether to render the effect in view coordinates, invariant of the zoom level. Defaults to `false`.
 * @param [timing] Specifies the timing function to use for the animation. Defaults to "1s linear 1 normal". The animation will loop once for [one second][yfiles.lang.TimeSpan] with a [linear][WebGL2AnimationEasing.LINEAR] progress in [normal][WebGL2AnimationDirection.NORMAL] direction.
 * @return An animation to assign to nodes
 * @see [setAnimations]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-createBeaconAnimation">Online Documentation</a>
 */
 final   fun createBeaconAnimation( type: WebGL2BeaconAnimationType  = definedExternally,
 color: Color?  = definedExternally,
 pulseWidth: Double  = definedExternally,
 pulseCount: Int  = definedExternally,
 pulseDistance: Double  = definedExternally,
 magnitude: Double  = definedExternally,
 smooth: Boolean  = definedExternally,
 useViewCoordinates: Boolean  = definedExternally,
 timing: WebGL2AnimationTiming?  = definedExternally):WebGL2Animation
/**
 * Gets the [CanvasComponent.contentGroup] when the [GraphModelManager.canvasComponent] property is set.
 * @return The [CanvasComponent.contentGroup] of the [GraphModelManager.canvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-createContentGroup">Online Documentation</a>
 */
 override   fun createContentGroup():ICanvasObjectGroup
/**
 * Creates an animation that animates the dash pattern of a [WebGL2PolylineEdgeStyle], [WebGL2ArcEdgeStyle], and [WebGL2BridgeEdgeStyle].
 * @param [extent] The extent of the animation in dash lengths. Defaults to 1.
 * @param [timing] Specifies the timing function to use for the animation. Defaults to "1s linear 1 normal". The animation will loop once for [one second][yfiles.lang.TimeSpan] with a [linear][WebGL2AnimationEasing.LINEAR] progress in [normal][WebGL2AnimationDirection.NORMAL] direction.
 * @return An animation to assign to edges.
 * @see [setAnimations]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-createDashAnimation">Online Documentation</a>
 */
 final   fun createDashAnimation( extent: Double  = definedExternally,
 timing: WebGL2AnimationTiming?  = definedExternally):WebGL2Animation
/**
 * Creates an animation that fades the colors of item effects like [WebGL2Effect.AMBIENT_FILL_COLOR].
 * @param [type] The type of fading to apply.
 * @param [color1] The first color to fade to when choosing mode [WebGL2FadeAnimationType.FADE_TO_COLOR]. This color will be applied to the white regions of a grayscale representation of the node effect.
 * @param [color2] The second color to fade to when choosing mode [WebGL2FadeAnimationType.FADE_TO_COLOR]. This color will be applied to the black regions of a grayscale representation of the node effect.
 * @param [timing] Specifies the timing function to use for the animation. Defaults to "1s linear 1 normal". The animation will loop once for [one second][yfiles.lang.TimeSpan] with a [linear][WebGL2AnimationEasing.LINEAR] progress in [normal][WebGL2AnimationDirection.NORMAL] direction.
 * @return An animation to assign to nodes, edges, or labels
 * @see [setAnimations]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-createEffectFadeAnimation">Online Documentation</a>
 */
 final   fun createEffectFadeAnimation( type: WebGL2FadeAnimationType ,
 color1: Color?  = definedExternally,
 color2: Color?  = definedExternally,
 timing: WebGL2AnimationTiming?  = definedExternally):WebGL2Animation
/**
 * Creates an animation that applies a pulsating effect to item effects like [WebGL2Effect.AMBIENT_FILL_COLOR].
 * @param [type] The type of the pulse to apply. Defaults to [WebGL2PulseAnimationType.GROW].
 * @param [amount] The extent of the pulses. Defaults to 2. Note that the amount has to be compatible with the type. For example, negative numbers have no effect when used on [WebGL2PulseAnimationType.GROW_RELATIVE]
 * @param [useViewCoordinates] Whether the extent of the animation is zoom-invariant for zoom values below 1.
 * @param [timing] Specifies the timing function to use for the animation. Defaults to "1s linear 1 normal". The animation will loop once for [one second][yfiles.lang.TimeSpan] with a [linear][WebGL2AnimationEasing.LINEAR] progress in [normal][WebGL2AnimationDirection.NORMAL] direction. [WebGL2AnimationEasing.EASE], [WebGL2AnimationEasing.EASE_IN], [WebGL2AnimationEasing.EASE_OUT], and [WebGL2AnimationEasing.EASE_IN_OUT] are interpreted the same and have the effect that the wave form is eased at its extremes (creating a sine-like wave form). [WebGL2AnimationEasing.STEP] creates a rectangular wave form.
 * @return An animation to assign to node effects.
 * @see [setAnimations]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-createEffectPulseAnimation">Online Documentation</a>
 */
 final   fun createEffectPulseAnimation( type: WebGL2PulseAnimationType  = definedExternally,
 amount: Double  = definedExternally,
 useViewCoordinates: Boolean  = definedExternally,
 timing: WebGL2AnimationTiming?  = definedExternally):WebGL2Animation
/**
 * Creates an animation that applies a scaling effect to item effects.
 * @param [type] The type of the scale to apply. Defaults to [WebGL2ScaleAnimationType.GROW].
 * @param [amount] The extent of the scale. Defaults to 5. For relative [WebGL2ScaleAnimationType]s this is the scaling factor.
 * @param [useViewCoordinates] Whether the extent of the animation is zoom-invariant for zoom values below 1.
 * @param [timing] Specifies the timing function to use for the animation. Defaults to "1s linear 1 normal". The animation will loop once for [one second][yfiles.lang.TimeSpan] with a [linear][WebGL2AnimationEasing.LINEAR] progress in [normal][WebGL2AnimationDirection.NORMAL] direction. Defaults to [WebGL2AnimationDirection.NORMAL].
 * @return An animation to assign to nodes effects
 * @see [setAnimations]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-createEffectScaleAnimation">Online Documentation</a>
 */
 final   fun createEffectScaleAnimation( type: WebGL2ScaleAnimationType  = definedExternally,
 amount: Double  = definedExternally,
 useViewCoordinates: Boolean  = definedExternally,
 timing: WebGL2AnimationTiming?  = definedExternally):WebGL2Animation
/**
 * Creates an animation that fades the colors of nodes, edges, or labels.
 * @param [type] The type of fading to apply.
 * @param [color1] The first color to fade to when choosing mode [WebGL2FadeAnimationType.FADE_TO_COLOR]. This color will be applied to the white regions of a grayscale representation of an item.
 * @param [color2] The second color to fade to when choosing mode [WebGL2FadeAnimationType.FADE_TO_COLOR]. This color will be applied to the black regions of a grayscale representation of an item.
 * @param [timing] Specifies the timing function to use for the animation. Defaults to "1s linear 1 normal". The animation will loop once for [one second][yfiles.lang.TimeSpan] with a [linear][WebGL2AnimationEasing.LINEAR] progress in [normal][WebGL2AnimationDirection.NORMAL] direction.
 * @return An animation to assign to nodes, edges, or labels
 * @see [setAnimations]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-createFadeAnimation">Online Documentation</a>
 */
 final   fun createFadeAnimation( type: WebGL2FadeAnimationType ,
 color1: Color?  = definedExternally,
 color2: Color?  = definedExternally,
 timing: WebGL2AnimationTiming?  = definedExternally):WebGL2Animation
/**
 * Creates a solid halo effect around nodes.
 * @param [color] The color of the halo. Defaults to semi-transparent 50% gray if not specified.
 * @param [magnitude] The distance the halo extends away from the shape. Defaults to 50.
 * @param [useViewCoordinates] Whether to render the effect in view coordinates, invariant of the zoom level. Defaults to `false`.
 * @param [timing] Specifies the timing function to use for the animation. Defaults to "1s linear 1 normal". The animation will loop once for [one second][yfiles.lang.TimeSpan] with a [linear][WebGL2AnimationEasing.LINEAR] progress in [normal][WebGL2AnimationDirection.NORMAL] direction.
 * @return An animation to assign to nodes
 * @see [setAnimations]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-createHaloAnimation">Online Documentation</a>
 */
 final   fun createHaloAnimation( color: Color?  = definedExternally,
 magnitude: Double  = definedExternally,
 useViewCoordinates: Boolean  = definedExternally,
 timing: WebGL2AnimationTiming?  = definedExternally):WebGL2Animation
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-createHitTester">Online Documentation</a>
 */
 override   fun <T : IModelItem>createHitTester( itemType: YClass<T> ):IHitTester<T>
/**
 * Creates an animation that applies a pulsating effect to nodes, labels, or edges.
 * @param [type] The type of the pulse to apply. Defaults to [WebGL2PulseAnimationType.GROW].
 * @param [amount] The extent of the pulses. Defaults to 2. Note that the amount has to be compatible with the type. For example, negative numbers have no effect when used on [WebGL2PulseAnimationType.GROW_RELATIVE]
 * @param [useViewCoordinates] Whether the extent of the animation is zoom-invariant for zoom values below 1.
 * @param [timing] Specifies the timing function to use for the animation. Defaults to "1s linear 1 normal". The animation will loop once for [one second][yfiles.lang.TimeSpan] with a [linear][WebGL2AnimationEasing.LINEAR] progress in [normal][WebGL2AnimationDirection.NORMAL] direction.
 * @return An animation to assign to nodes, edges, or labels
 * @see [setAnimations]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-createPulseAnimation">Online Documentation</a>
 */
 final   fun createPulseAnimation( type: WebGL2PulseAnimationType  = definedExternally,
 amount: Double  = definedExternally,
 useViewCoordinates: Boolean  = definedExternally,
 timing: WebGL2AnimationTiming?  = definedExternally):WebGL2Animation
/**
 * Creates an animation that applies a scaling effect to nodes, edges, or labels.
 * @param [type] The type of the scale to apply. Defaults to [WebGL2ScaleAnimationType.GROW].
 * @param [amount] The extent of the scale. Defaults to 5. For relative [WebGL2ScaleAnimationType]s this is the scaling factor.
 * @param [useViewCoordinates] Whether the extent of the animation is zoom-invariant for zoom values below 1.
 * @param [timing] Specifies the timing function to use for the animation. Defaults to "1s linear 1 normal". The animation will loop once for [one second][yfiles.lang.TimeSpan] with a [linear][WebGL2AnimationEasing.LINEAR] progress in [normal][WebGL2AnimationDirection.NORMAL] direction.
 * @return An animation to assign to nodes, edges, or labels
 * @see [setAnimations]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-createScaleAnimation">Online Documentation</a>
 */
 final   fun createScaleAnimation( type: WebGL2ScaleAnimationType  = definedExternally,
 amount: Double  = definedExternally,
 useViewCoordinates: Boolean  = definedExternally,
 timing: WebGL2AnimationTiming?  = definedExternally):WebGL2Animation
/**
 * Creates an animation that applies a shake effect to nodes, edges, or labels.
 * @param [type] The type of shake to apply.
 * @param [magnitude] The distance the shake moves an item. Defaults to 2.
 * @param [useViewCoordinates] Whether the extent of the animation is zoom-invariant for zoom values below 1.
 * @param [timing] Specifies the timing function to use for the animation. Defaults to "1s linear 1 normal". The animation will loop once for [one second][yfiles.lang.TimeSpan] with a [linear][WebGL2AnimationEasing.LINEAR] progress in [normal][WebGL2AnimationDirection.NORMAL] direction. [WebGL2AnimationEasing.EASE], [WebGL2AnimationEasing.EASE_IN], [WebGL2AnimationEasing.EASE_OUT], and [WebGL2AnimationEasing.EASE_IN_OUT] are interpreted the same and have the effect that the wave form is eased at its extremes (creating a sine-like wave form). [WebGL2AnimationEasing.STEP] creates a rectangular wave form.
 * @return An animation to assign to nodes, edges, or labels
 * @see [setAnimations]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-createShakeAnimation">Online Documentation</a>
 */
 final   fun createShakeAnimation( type: WebGL2ShakeAnimationType ,
 magnitude: Double  = definedExternally,
 useViewCoordinates: Boolean  = definedExternally,
 timing: WebGL2AnimationTiming?  = definedExternally):WebGL2Animation
/**
 * Returns the currently associated animations for the given item.
 * @param [item] This should be a node, edge, or label, currently managed and rendered by this instance.
 * @return A copy of a possibly empty array of all the animations currently in effect for the provided item.
 * @throws NotSupportedError If this instance is not associated with a graph via a component.
 * @see [setStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-getAnimations">Online Documentation</a>
 */
 final   fun getAnimations( item: IModelItem ):ReadonlyArray<WebGL2Animation>
/**
 * Returns the currently associated style to use for the edge when rendered in WebGL mode.
 * @param [edge] The edge to return the style for.
 * @return The style that is used for rendering the item.
 * @throws ArgumentError When the edge is not managed and rendered by this instance.
 * @throws NotSupportedError If this instance is not associated with a graph via a component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-getStyle(IEdge)">Online Documentation</a>
 */
 final   fun getStyle( edge: IEdge ):IEdgeStyle /* WebGL2PolylineEdgeStyle | WebGL2ArcEdgeStyle | WebGL2BridgeEdgeStyle */
/**
 * Returns the currently associated style to use for the node when rendered in WebGL mode.
 * @param [node] The node to return the style for.
 * @return The style that is used for rendering the item.
 * @throws ArgumentError When the node is not managed and rendered by this instance.
 * @throws NotSupportedError If this instance is not associated with a graph via a component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-getStyle(INode)">Online Documentation</a>
 */
 final   fun getStyle( node: INode ):INodeStyle /* WebGL2ShapeNodeStyle | WebGL2IconNodeStyle | WebGL2GroupNodeStyle */
/**
 * Returns the currently associated style to use for the label when rendered in WebGL mode.
 * @param [label] The label to return the style for.
 * @return The style that is used for rendering the item.
 * @throws ArgumentError When the label is not managed and rendered by this instance.
 * @throws NotSupportedError If this instance is not associated with a graph via a component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-getStyle(ILabel)">Online Documentation</a>
 */
 final   fun getStyle( label: ILabel ):ILabelStyle /* WebGL2DefaultLabelStyle | WebGL2IconLabelStyle */
/**
 * Gets a WebGL2 edge style that is similar to the [IEdgeStyle] of the given `edge`.
 * @param [edge] The edge from the [IGraph].
 * @return A (possibly shared) instance of either a [WebGL2PolylineEdgeStyle]s, [WebGL2ArcEdgeStyle], or [WebGL2BridgeEdgeStyle]. Returning `null` will apply a default style instead.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-getWebGL2EdgeStyle">Online Documentation</a>
 */
 open protected   fun getWebGL2EdgeStyle( edge: IEdge ):IEdgeStyle /* WebGL2PolylineEdgeStyle | WebGL2ArcEdgeStyle | WebGL2BridgeEdgeStyle */?
/**
 * Gets a WebGL2 label style that is similar to the [ILabelStyle] of the given `label`.
 * @param [label] The label from the [IGraph]
 * @return A (possibly shared) instance of either a [WebGL2DefaultLabelStyle] or [WebGL2IconLabelStyle]. Returning `null` will apply a default style instead.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-getWebGL2LabelStyle">Online Documentation</a>
 */
 open protected   fun getWebGL2LabelStyle( label: ILabel ):ILabelStyle /* WebGL2DefaultLabelStyle | WebGL2IconLabelStyle */?
/**
 * Gets a WebGL2 node style that is similar to the [INodeStyle] of the given `node`.
 * @param [node] The node from the [IGraph].
 * @return A (possibly shared) instance of either a [WebGL2ShapeNodeStyle], [WebGL2IconNodeStyle], or [WebGL2GroupNodeStyle]. Returning `null` will apply a default style instead.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-getWebGL2NodeStyle">Online Documentation</a>
 */
 open protected   fun getWebGL2NodeStyle( node: INode ):INodeStyle /* WebGL2ShapeNodeStyle | WebGL2IconNodeStyle | WebGL2GroupNodeStyle */?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-hitElementsAt">Online Documentation</a>
 */
 override   fun hitElementsAt( context: IInputModeContext ,
 location: Point ,
 root: ICanvasObjectGroup ):IEnumerable<IModelItem>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-install">Online Documentation</a>
 */
 override   fun install( canvas: CanvasComponent ,
 graph: IGraph )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-onGraphChanged">Online Documentation</a>
 */
 override   fun onGraphChanged( oldGraph: IGraph? ,
 newGraph: IGraph? )
/**
 * Sets the animations to apply to the node.
 * @param [node] The node instance to specify the animations for. The node must belong to the displayed graph.
 * @param [animations] The animations to apply. Animations may and should be shared among items. Provide `null` or an empty array in order to clear existing animations.
 * @throws NotSupportedError If this instance is not associated with a graph via a component.
 * @see [WebGL2Animation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-setAnimations(INode,WebGL2Animation[])">Online Documentation</a>
 */
 final   fun setAnimations( node: INode ,
 animations: ReadonlyArray<WebGL2Animation>? )
/**
 * Sets the animations to apply to the edge.
 * @param [edge] The edge instance to specify the animations for. The edge must belong to the displayed graph.
 * @param [animations] The animations to apply. Animations may and should be shared among items. Provide `null` or an empty array in order to clear existing animations.
 * @throws NotSupportedError If this instance is not associated with a graph via a component.
 * @see [WebGL2Animation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-setAnimations(IEdge,WebGL2Animation[])">Online Documentation</a>
 */
 final   fun setAnimations( edge: IEdge ,
 animations: ReadonlyArray<WebGL2Animation>? )
/**
 * Sets the animations to apply to the label.
 * @param [label] The label instance to specify the animations for. The label must belong to the displayed graph.
 * @param [animations] The animations to apply. Animations may and should be shared among items. Provide `null` or an empty array in order to clear existing animations.
 * @throws NotSupportedError If this instance is not associated with a graph via a component.
 * @see [WebGL2Animation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-setAnimations(ILabel,WebGL2Animation[])">Online Documentation</a>
 */
 final   fun setAnimations( label: ILabel ,
 animations: ReadonlyArray<WebGL2Animation>? )
/**
 * Sets the style to use for the node when rendered in WebGL2 mode.
 * @param [node] The node instance to specify the style for. The node must belong to the displayed graph.
 * @param [style] The style to use. Style instances may be shared among items and graphs.
 * @throws NotSupportedError If this instance is not associated with a graph via a component.
 * @see [getStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-setStyle(INode,Object)">Online Documentation</a>
 */
 final   fun setStyle( node: INode ,
 style: INodeStyle /* WebGL2ShapeNodeStyle | WebGL2IconNodeStyle | WebGL2GroupNodeStyle */ )
/**
 * Sets the style to use for the edge when rendered in WebGL2 mode.
 * @param [edge] The edge instance to specify the style for. The edge must belong to the displayed graph.
 * @param [style] The style to use. Style instances may be shared among items and graphs.
 * @throws NotSupportedError If this instance is not associated with a graph via a component.
 * @see [getStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-setStyle(IEdge,Object)">Online Documentation</a>
 */
 final   fun setStyle( edge: IEdge ,
 style: IEdgeStyle /* WebGL2PolylineEdgeStyle | WebGL2ArcEdgeStyle | WebGL2BridgeEdgeStyle */ )
/**
 * Sets the style to use for the label when rendered in WebGL2 mode.
 * @param [label] The label instance to specify the style for. The label must belong to the displayed graph.
 * @param [style] The style to use. Style instances may be shared among items and graphs.
 * @throws NotSupportedError If this instance is not associated with a graph via a component.
 * @see [getStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-setStyle(ILabel,Object)">Online Documentation</a>
 */
 final   fun setStyle( label: ILabel ,
 style: ILabelStyle /* WebGL2DefaultLabelStyle | WebGL2IconLabelStyle */ )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-typedHitElementsAt">Online Documentation</a>
 */
 override   fun <T : IModelItem>typedHitElementsAt( modelItemType: YClass<T> ,
 context: IInputModeContext ,
 location: Point ,
 root: ICanvasObjectGroup ):IEnumerable<T>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( canvas: CanvasComponent )
/**
 * Updates the location of the WebGL2 visualization of the given `label`.
 * @param [label] The label for which the rendering location should be updated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-updateLabelPosition">Online Documentation</a>
 */
 final   fun updateLabelPosition( label: ILabel )
/**
 * Explicitly updates the WebGL2 style of a `node`
 * @param [node] The node for which the WebGL2 style should be updated.
 * @throws NotSupportedError If this instance is not associated with a graph via a component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-updateStyle(INode)">Online Documentation</a>
 */
 final   fun updateStyle( node: INode )
/**
 * Explicitly updates the WebGL2 style of an `edge`
 * @param [edge] The edge for which the WebGL2 style should be updated.
 * @throws NotSupportedError If this instance is not associated with a graph via a component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-updateStyle(IEdge)">Online Documentation</a>
 */
 final   fun updateStyle( edge: IEdge )
/**
 * Explicitly updates the WebGL2 style of a `label`
 * @param [label] The label for which the WebGL2 style should be updated.
 * @throws NotSupportedError If this instance is not associated with a graph via a component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23WebGL2GraphModelManager-method-updateStyle(ILabel)">Online Documentation</a>
 */
 final   fun updateStyle( label: ILabel )
/**
 * Occurs when the asynchronous compilation of WebGL2 shaders has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23ShadersCompiling">Online Documentation</a>
 */
fun addShadersCompilingListener(listener: EventHandler1<EventArgs>)
fun removeShadersCompilingListener(listener: EventHandler1<EventArgs>)

/**
 * Occurs when the asynchronous compilation of WebGL2 shaders has finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23ShadersCompiled">Online Documentation</a>
 */
fun addShadersCompiledListener(listener: EventHandler1<EventArgs>)
fun removeShadersCompiledListener(listener: EventHandler1<EventArgs>)

companion object : ClassMetadata<WebGL2GraphModelManager> {
}
}

inline fun WebGL2GraphModelManager(
    block: WebGL2GraphModelManager.() -> Unit
): WebGL2GraphModelManager {
    return WebGL2GraphModelManager()
        .apply(block)
}

/**
 * Occurs when the asynchronous compilation of WebGL2 shaders has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23ShadersCompiling">Online Documentation</a>
 */
inline fun  WebGL2GraphModelManager.addShadersCompilingHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addShadersCompilingListener(listener)
    return { removeShadersCompilingListener(listener) }
}
/**
 * Occurs when the asynchronous compilation of WebGL2 shaders has finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManager%23ShadersCompiled">Online Documentation</a>
 */
inline fun  WebGL2GraphModelManager.addShadersCompiledHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addShadersCompiledListener(listener)
    return { removeShadersCompiledListener(listener) }
}
