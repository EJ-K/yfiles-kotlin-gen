// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import js.core.Void
import js.promise.Promise
import web.dom.Element
import web.events.Event
import web.html.HTMLDivElement
import web.html.HTMLElement
import yfiles.collections.IEnumerable
import yfiles.collections.IListEnumerable
import yfiles.geometry.Insets
import yfiles.geometry.Matrix
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.graph.ILookup
import yfiles.graph.LookupChain
import yfiles.input.EventRecognizer
import yfiles.input.IInputMode
import yfiles.input.IInputModeContext
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs
import yfiles.lang.EventHandler
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.Predicate
import yfiles.lang.PropertyChangedEventArgs
import yfiles.lang.PropertyChangedEventHandler
import yfiles.lang.TimeSpan
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * The [CanvasComponent] can be used to efficiently display all kinds of data.
 * @see [IVisualCreator]
 * @see [IHitTestable][yfiles.input.IHitTestable]
 * @see [IVisibilityTestable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [CanvasComponent] with default properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-constructor-CanvasComponent()">Online Documentation</a>
 */
external open class CanvasComponent  () : ILookup, IEventDispatcher {
/**
 * Creates a new instance of [CanvasComponent] for the provided `div` element.
 * @param [div] The existing `div` element to use for rendering the canvas into. All its child nodes are added to the [overlayPanel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-constructor-CanvasComponent(HTMLDivElement)">Online Documentation</a>
 */
 constructor( div: HTMLDivElement )
/**
 * Creates a new instance of [CanvasComponent] using the `div` element that is specified by the `selector`.
 * @param [selector] The CSS selector or id for an existing `div` element. All child nodes of this element are added to the [overlayPanel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-constructor-CanvasComponent(string)">Online Documentation</a>
 */
 constructor( selector: String )

/**
 * Gets or sets a value indicating whether [ICommand][yfiles.input.ICommand]s for scrolling like for example [ICommand.SCROLL_PAGE_DOWN][yfiles.input.ICommand.SCROLL_PAGE_DOWN], the scrolling should be performed in animated fashion.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23animateScrollCommands">Online Documentation</a>
 */
@Deprecated("Read documentation for more information")
final var animateScrollCommands: Boolean
/**
 * Gets or sets a combination of viewport changes which should be performed in an animated fashion.
 * @see [getViewportAnimationDuration]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23animatedViewportChanges">Online Documentation</a>
 */
final var animatedViewportChanges: ViewportChanges
/**
 * Gets the aria-live region of the [CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23ariaLiveRegion">Online Documentation</a>
 */
final val ariaLiveRegion: HTMLDivElement
/**
 * Gets or sets a property that causes the control to automatically pan the view when the mouse gets dragged outside of the bounds of the control.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23autoDrag">Online Documentation</a>
 */
final var autoDrag: Boolean
/**
 * Gets or sets the auto drag insets.
 * @see [autoDrag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23autoDragInsets">Online Documentation</a>
 */
final var autoDragInsets: Insets
/**
 * Gets or sets the BackgroundGroup property.
 * @see [contentGroup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23backgroundGroup">Online Documentation</a>
 */
final var backgroundGroup: ICanvasObjectGroup
/**
 * Gets an implementation of [ICanvasContext] that describes the state of this [CanvasComponent].
 * @see [IHitTestable][yfiles.input.IHitTestable]
 * @see [IBoundsProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23canvasContext">Online Documentation</a>
 */
final val canvasContext: ICanvasContext
/**
 * Gets or sets a value indicating whether all keyboard input is captured.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23captureAllKeyboardInput">Online Documentation</a>
 */
final var captureAllKeyboardInput: Boolean
/**
 * Gets or sets a value indicating whether all pointer input is captured.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23captureAllPointerInput">Online Documentation</a>
 */
final var captureAllPointerInput: Boolean
/**
 * Gets or sets the world coordinate at the center of the control.
 * @see [viewPoint]
 * @see [zoomTo]
 * @see [zoomToAnimated]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23center">Online Documentation</a>
 */
final var center: Point
/**
 * Gets or sets an event recognizer that determines whether zooming with the mouse wheel should zoom to the center of the view instead of the mouse location.
 * 
 * The default is [KeyEventRecognizers.SHIFT_IS_DOWN][yfiles.input.KeyEventRecognizers.SHIFT_IS_DOWN].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23centerZoomEventRecognizer">Online Documentation</a>
 */
final var centerZoomEventRecognizer: EventRecognizer
/**
 * Gets or sets the [ICanvasObjectGroup] that should be used by the application code to put actual content in.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23contentGroup">Online Documentation</a>
 */
final var contentGroup: ICanvasObjectGroup
/**
 * Gets and sets the insets in view coordinates that should be used by the [fitContent] operation or zoom commands which zoom to a given rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23contentMargins">Online Documentation</a>
 */
final var contentMargins: Insets
/**
 * Gets and sets the Rectangle in world coordinates that holds the contents.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23contentRect">Online Documentation</a>
 */
final var contentRect: Rect
/**
 * Gets a list of the active [TouchDevice]s at the time of invocation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23currentTouchDevices">Online Documentation</a>
 */
final val currentTouchDevices: IListEnumerable<TouchDevice>
/**
 * Gets or sets the scaling factor for HTML5 canvas and WebGL rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23devicePixelRatio">Online Documentation</a>
 */
final var devicePixelRatio: Double
/**
 * Gets the `div` element that represents this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23div">Online Documentation</a>
 */
final val div: HTMLDivElement
/**
 * Gets or sets the area in view coordinates the mouse needs to stay in before multiple clicks are considered multiple single clicks instead of multi-clicks.
 * @see [doubleClickTime]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23doubleClickSize">Online Documentation</a>
 */
final var doubleClickSize: Size
/**
 * Gets or sets the value of the double click time.
 * @see [doubleClickSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23doubleClickTime">Online Documentation</a>
 */
final var doubleClickTime: TimeSpan
/**
 * Gets or sets the area in view coordinates the touch pointer needs to stay in before multiple taps are considered multiple single taps instead of multi-taps.
 * @see [doubleTapTime]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23doubleTapSize">Online Documentation</a>
 */
final var doubleTapSize: Size
/**
 * Gets or sets the value of the double tap time.
 * @see [doubleTapSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23doubleTapTime">Online Documentation</a>
 */
final var doubleTapTime: TimeSpan
/**
 * Gets or sets the area in view coordinates the mouse may stay in before a movement is considered a drag.
 * @see [dragSizeTouch]
 * @see [addMouseDragListener]
 * @see [addMouseClickListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23dragSize">Online Documentation</a>
 */
final var dragSize: Size
/**
 * Gets or sets the area in view coordinates the touch point may stay in before a movement is considered a drag.
 * @see [dragSize]
 * @see [addTouchMoveListener]
 * @see [addTouchClickListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23dragSizeTouch">Online Documentation</a>
 */
final var dragSizeTouch: Size
/**
 * Gets or sets the value of the drag time.
 * @see [dragSize]
 * @see [dragSizeTouch]
 * @see [addMouseDragListener]
 * @see [addMouseClickListener]
 * @see [addTouchMoveListener]
 * @see [addTouchClickListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23dragTime">Online Documentation</a>
 */
final var dragTime: TimeSpan
/**
 * Gets the [dropTarget] associated with this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23dropTarget">Online Documentation</a>
 */
final val dropTarget: DropTarget
/**
 * Gets or sets the [ICanvasObjectGroup] which is used for visual markers of the [GraphComponent.currentItem].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23focusGroup">Online Documentation</a>
 */
final var focusGroup: ICanvasObjectGroup
/**
 * Gets a value indicating whether this [CanvasComponent] is currently focused.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23focused">Online Documentation</a>
 */
final val focused: Boolean
/**
 * Gets a value indicating whether this instance currently has mouse capture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23hasMouseCapture">Online Documentation</a>
 */
protected final val hasMouseCapture: Boolean
/**
 * Gets or sets the [ICanvasObjectGroup] which is used for visual markers to highlight [IModelItem][yfiles.graph.IModelItem]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23highlightGroup">Online Documentation</a>
 */
final var highlightGroup: ICanvasObjectGroup
/**
 * Gets or sets the radius of the area around the mouse in view coordinates in which an [IHitTestable][yfiles.input.IHitTestable] may lie to be considered a valid hit.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23hitTestRadius">Online Documentation</a>
 */
final var hitTestRadius: Double
/**
 * Gets or sets the radius of the area around the touch point in view coordinates in which an [IHitTestable][yfiles.input.IHitTestable] may lie to be considered a valid hit.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23hitTestRadiusTouch">Online Documentation</a>
 */
final var hitTestRadiusTouch: Double
/**
 * Gets or sets the visibility policy for the horizontal scrollbar.
 * @see [MoveViewportInputMode][yfiles.input.MoveViewportInputMode]
 * @see [verticalScrollBarPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23horizontalScrollBarPolicy">Online Documentation</a>
 */
open var horizontalScrollBarPolicy: ScrollBarVisibility
/**
 * Gets or sets the image-rendering type for this visual and its children.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23imageRendering">Online Documentation</a>
 */
final var imageRendering: ImageRenderingType
/**
 * Gets the size of the usable area in which the graph will be displayed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23innerSize">Online Documentation</a>
 */
final val innerSize: Size
/**
 * Gets or sets the single [IInputMode] instance that shall be installed for this canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23inputMode">Online Documentation</a>
 */
final var inputMode: IInputMode?
/**
 * Gets or sets the InputModeContext property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23inputModeContext">Online Documentation</a>
 */
final var inputModeContext: IInputModeContext
/**
 * Gets the [LookupChain] that can be used do decorate the [ILookup.lookup] call in the [inputModeContext].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23inputModeContextLookupChain">Online Documentation</a>
 */
final val inputModeContextLookupChain: LookupChain<CanvasComponent>
/**
 * Gets or sets the [ICanvasObjectGroup] where the [IInputMode]s should add their temporary content to.
 * @see [contentGroup]
 * @see [backgroundGroup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23inputModeGroup">Online Documentation</a>
 */
final var inputModeGroup: ICanvasObjectGroup
/**
 * Gets a value indicating whether at least one finger is on the touch screen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23isTouchDeviceDown">Online Documentation</a>
 */
final val isTouchDeviceDown: Boolean
/**
 * Gets the last location provided by a pointing device (for instance mouse or touch).
 * @see [lastMouseEvent]
 * @see [lastTouchEvent]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23lastEventLocation">Online Documentation</a>
 */
final val lastEventLocation: Point
/**
 * Gets the last [mouse event][MouseEventArgs] or [touch event][TouchEventArgs] triggered by this instance.
 * @see [addMouseEnterListener]
 * @see [addMouseMoveListener]
 * @see [addMouseLeaveListener]
 * @see [addMouseDownListener]
 * @see [addMouseUpListener]
 * @see [addMouseDragListener]
 * @see [addMouseWheelListener]
 * @see [addMouseClickListener]
 * @see [addTouchEnterListener]
 * @see [addTouchMoveListener]
 * @see [addTouchLeaveListener]
 * @see [addTouchDownListener]
 * @see [addTouchUpListener]
 * @see [addTouchLongPressListener]
 * @see [addTouchClickListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23lastInputEvent">Online Documentation</a>
 */
final val lastInputEvent: EventArgs /* MouseEventArgs | TouchEventArgs */
/**
 * Gets the last [mouse event][MouseEventArgs] triggered by this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23lastMouseEvent">Online Documentation</a>
 */
final val lastMouseEvent: MouseEventArgs
/**
 * Gets the last [touch event][TouchEventArgs] triggered by this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23lastTouchEvent">Online Documentation</a>
 */
final val lastTouchEvent: TouchEventArgs
/**
 * Gets or sets a value indicating whether the maximum zoom level for [fitContent] and [ICommand.FIT_CONTENT][yfiles.input.ICommand.FIT_CONTENT] is limited to 1.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23limitFitContentZoom">Online Documentation</a>
 */
final var limitFitContentZoom: Boolean
/**
 * Gets or sets the value of the long press time.
 * @see [dragSizeTouch]
 * @see [addTouchDownListener]
 * @see [addTouchMoveListener]
 * @see [addTouchLongPressListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23longPressTime">Online Documentation</a>
 */
final var longPressTime: TimeSpan
/**
 * Gets or sets the maximum zoom factor for this [CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23maximumZoom">Online Documentation</a>
 */
final var maximumZoom: Double
/**
 * Gets or sets the minimum zoom factor for this [CanvasComponent].
 * @see [zoom]
 * @see [maximumZoom]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23minimumZoom">Online Documentation</a>
 */
final var minimumZoom: Double
/**
 * Gets or sets a value that specifies whether this control receives mouse input after the mouse is dragged out of its bounding area.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23mouseCapture">Online Documentation</a>
 */
final var mouseCapture: Boolean
/**
 * Gets or sets the action to perform when turning the mouse wheel.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23mouseWheelBehavior">Online Documentation</a>
 */
final var mouseWheelBehavior: MouseWheelBehaviors
/**
 * Gets or sets a factor that controls how fast the viewport scrolls when the mouse wheel is turned.
 * @see [mouseWheelZoomFactor]
 * @see [mouseWheelBehavior]
 * @see [MouseEventArgs.scrollAmount]
 * @see [MouseEventArgs.deltaMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23mouseWheelScrollFactor">Online Documentation</a>
 */
final var mouseWheelScrollFactor: Double
/**
 * Gets or sets an event recognizer that determines whether turning the mouse wheel should perform [zooming][mouseWheelZoom] instead of [scrolling][mouseWheelScroll].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23mouseWheelZoomEventRecognizer">Online Documentation</a>
 */
final var mouseWheelZoomEventRecognizer: EventRecognizer
/**
 * Gets or sets the factor by which the zoom level changes when the mouse wheel is turned.
 * 
 * The default value is 1.2.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23mouseWheelZoomFactor">Online Documentation</a>
 */
final var mouseWheelZoomFactor: Double
/**
 * Gets or sets a value indicating whether navigation related command bindings are enabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23navigationCommandsEnabled">Online Documentation</a>
 */
final var navigationCommandsEnabled: Boolean
/**
 * Gets or sets an event recognizer that temporarily enables mouse wheel events.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23noFocusMouseWheelRecognizer">Online Documentation</a>
 */
final var noFocusMouseWheelRecognizer: EventRecognizer
/**
 * Returns an HTML element that can be used to show arbitrary HTML content like overlays, fly-outs, or pop-ups on top of this [CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23overlayPanel">Online Documentation</a>
 */
final val overlayPanel: HTMLElement
/**
 * Gets or sets a value indicating whether to prevent scrolling if the element gets focused.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23preventFocusScrolling">Online Documentation</a>
 */
final var preventFocusScrolling: Boolean
/**
 * Gets or sets a [Matrix] that is applied to the viewport.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23projection">Online Documentation</a>
 */
final var projection: Matrix
/**
 * Gets or sets a value indicating whether input coordinates (mouse and touch) should be quantized depending on the zoom level to give nicer values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23quantizeInputCoordinates">Online Documentation</a>
 */
final var quantizeInputCoordinates: Boolean
/**
 * Gets the resources for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23resources">Online Documentation</a>
 */
final val resources: ResourceMap
/**
 * Gets a value indicating whether the UI is right to left.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23rightToLeft">Online Documentation</a>
 */
final val rightToLeft: Boolean
/**
 * Gets the root of the scene graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23rootGroup">Online Documentation</a>
 */
final val rootGroup: ICanvasObjectGroup
/**
 * Gets or sets the [ICanvasObjectGroup] that should be used by the application code to put the selection indicators in.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23selectionGroup">Online Documentation</a>
 */
final var selectionGroup: ICanvasObjectGroup
/**
 * Gets or sets the shape-rendering type for this visual and its children.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23shapeRendering">Online Documentation</a>
 */
final var shapeRendering: ShapeRenderingType
/**
 * Returns the size of the HTML element.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23size">Online Documentation</a>
 */
final val size: Size
/**
 * Gets or sets how size changes of this [CanvasComponent] will be detected.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23sizeChangedDetection">Online Documentation</a>
 */
final var sizeChangedDetection: SizeChangedDetectionMode
/**
 * Gets the control's [svgDefsManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23svgDefsManager">Online Documentation</a>
 */
final val svgDefsManager: SvgDefsManager
/**
 * Gets or sets the theme of this component that is used to configure the general look and feel of its interaction visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23theme">Online Documentation</a>
 */
final var theme: Theme
/**
 * Gets or sets whether to add a 'glass pane' overlay to the [CanvasComponent] that acts as the source for all mouse and touch events.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23useGlassPane">Online Documentation</a>
 */
final var useGlassPane: Boolean
/**
 * Gets or sets the visibility policy for the vertical scrollbar.
 * @see [MoveViewportInputMode][yfiles.input.MoveViewportInputMode]
 * @see [horizontalScrollBarPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23verticalScrollBarPolicy">Online Documentation</a>
 */
open var verticalScrollBarPolicy: ScrollBarVisibility
/**
 * Gets or sets the current view point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23viewPoint">Online Documentation</a>
 */
final var viewPoint: Point
/**
 * Gets the smallest rectangle in world coordinates that encompasses the visible viewing region.
 * @see [viewPoint]
 * @see [zoom]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23viewport">Online Documentation</a>
 */
final val viewport: Rect
/**
 * Gets or sets the [ViewportLimiter] instance that can be used to limit the explorable region.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23viewportLimiter">Online Documentation</a>
 */
final var viewportLimiter: ViewportLimiter
/**
 * Gets or sets the policy for caching [Visual]s which are temporarily removed from the visual tree.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23visualCaching">Online Documentation</a>
 */
final var visualCaching: VisualCachingPolicy
/**
 * Gets or sets the zoom factor for this [CanvasComponent].
 * @see [addZoomChangedListener]
 * @see [minimumZoom]
 * @see [maximumZoom]
 * @see [zoomTo]
 * @see [zoomToAnimated]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23zoom">Online Documentation</a>
 */
final var zoom: Double
/**
 * Cleans up by removing any connection from the [div] element to the [CanvasComponent] instance and any associated element that was created during the lifetime of the component.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-cleanUp">Online Documentation</a>
 */
 open   fun cleanUp()
/**
 * Helper method that ensures that the view port limit as returned by the [viewportLimiter] are obeyed.
 * @see [viewportLimiter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-coerceViewportLimits">Online Documentation</a>
 */
 open   fun coerceViewportLimits()
/**
 * Compares two [ICanvasObject] instances that are live in this canvas.
 * @param [canvasObject1] the first object to compare
 * @param [canvasObject2] the second object to compare
 * @return 0 if canvasObject1 == canvasObject2, >0 if canvasObject1 is painted before canvasObject2, <0 if canvasObject1 is painted after canvasObject2
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-compareRenderOrder">Online Documentation</a>
 */
 final   fun compareRenderOrder( canvasObject1: ICanvasObject ,
 canvasObject2: ICanvasObject ):Int
/**
 * Replaces the `cursor` to account for [projection].
 * @param [cursor] The cursor to adjust, can be `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-compensateCursorForProjection">Online Documentation</a>
 */
 open protected   fun compensateCursorForProjection( cursor: Cursor? ):Cursor?
/**
 * Factory method for the BackgroundGroup property.
 * @return a new instance of ICanvasObjectGroup
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-createBackgroundGroup">Online Documentation</a>
 */
 open protected   fun createBackgroundGroup():ICanvasObjectGroup
/**
 * Factory method for the [contentGroup] property.
 * @return a new instance of ICanvasObjectGroup
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-createContentGroup">Online Documentation</a>
 */
 open protected   fun createContentGroup():ICanvasObjectGroup
/**
 * Factory method for the [focusGroup] property.
 * @return a new instance of ICanvasObjectGroup
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-createFocusGroup">Online Documentation</a>
 */
 open protected   fun createFocusGroup():ICanvasObjectGroup
/**
 * Factory method for the [highlightGroup] property.
 * @return a new instance of ICanvasObjectGroup
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-createHighlightGroup">Online Documentation</a>
 */
 open protected   fun createHighlightGroup():ICanvasObjectGroup
/**
 * Factory method for the [inputModeContext] property.
 * @return a new instance of [IInputModeContext] that has this instance set as its [ICanvasContext.canvasComponent] and uses this instance's [inputModeContextLookup] method to satisfy requests.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-createInputModeContext">Online Documentation</a>
 */
 open protected   fun createInputModeContext():IInputModeContext
/**
 * Factory method for the [inputModeGroup] property.
 * @return a new instance of [ICanvasObjectGroup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-createInputModeGroup">Online Documentation</a>
 */
 open protected   fun createInputModeGroup():ICanvasObjectGroup
/**
 * Creates an appropriate [render context][IRenderContext] that can be used to [create visuals][IVisualCreator.createVisual] using [IVisualCreator] implementations.
 * @return A new context instance that is bound to this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-createRenderContext">Online Documentation</a>
 */
 open   fun createRenderContext():IRenderContext
/**
 * Factory method for the [selectionGroup] property.
 * @return a new instance of [ICanvasObjectGroup].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-createSelectionGroup">Online Documentation</a>
 */
 open protected   fun createSelectionGroup():ICanvasObjectGroup
/**
 * Ensures that the provided bounds in world coordinates are visible by adjusting the viewport accordingly.
 * @param [bounds] The bounds to make visible.
 * @param [viewportInsets] Insets in view coordinates to keep free around the content.
 * @return A [Promise] that completes when the view port has been adjusted.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-ensureVisible(Rect,Insets)">Online Documentation</a>
 */
 open   fun ensureVisible( bounds: Rect ,
 viewportInsets: Insets?  = definedExternally):Promise<Void>
/**
 * Ensures that the provided points in world coordinates are all visible by adjusting the viewport accordingly.
 * @param [points] The points to make visible.
 * @param [viewportInsets] Insets in view coordinates to keep free around the content.
 * @return A [Promise] that completes when the view port has been adjusted.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-ensureVisible(IEnumerable,Insets)">Online Documentation</a>
 */
 open   fun ensureVisible( points: IEnumerable<Point> ,
 viewportInsets: Insets?  = definedExternally):Promise<Void>
/**
 * Exports the graphical content for this [CanvasComponent].
 * @param [context] The context to use.
 * @return An SVG element that represents the contents of this control.
 * @see [SvgExport.createRenderContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-exportContent">Online Documentation</a>
 */
 open   fun exportContent( context: IRenderContext ):Element
/**
 * Fires the size changed event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-fireSizeChanged">Online Documentation</a>
 */
 final   fun fireSizeChanged( oldSize: Size )
/**
 * Adjusts the view port to fully encompass the [contentRect].
 * @param [animated] Whether to change the viewport in an animated fashion.
 * @return A [Promise] that completes when the view port has been adjusted.
 * @see [updateContentRect]
 * @see [zoom]
 * @see [zoomTo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-fitContent">Online Documentation</a>
 */
 open   fun fitContent( animated: Boolean  = definedExternally):Promise<Void>
/**
 * Focuses the [div] element that is backing this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-focus">Online Documentation</a>
 */
 final   fun focus()
/**
 * Calculates the bounds for a given canvas object in the scene graph.
 * @param [canvasObject] the canvas object to query the bounds from
 * @return the non-`null` bounds
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-getBounds">Online Documentation</a>
 */
 final   fun getBounds( canvasObject: ICanvasObject ):Rect
/**
 * Returns the top most canvas object instance that is hit at the given coordinate set.
 * @param [location] the coordinates of the query in the world coordinate system
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-getCanvasObject">Online Documentation</a>
 */
 final   fun getCanvasObject( location: Point ):ICanvasObject?
/**
 * Enumerates over all possible [ICanvasObject] instances in the tree below the given group.
 * @param [root] The group at which the enumeration should yield all the children recursively. If omitted/`null`, this will iterate over all elements in the tree.
 * @return An enumerable for all [ICanvasObject]s in the tree below the given group.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-getCanvasObjects(ICanvasObjectGroup)">Online Documentation</a>
 */
 final   fun getCanvasObjects( root: ICanvasObjectGroup?  = definedExternally):IEnumerable<ICanvasObject>
/**
 * Returns a list of all canvas objects in hit order at the given world coordinate location.
 * @param [location] the coordinates of the query in the world coordinate system
 * @return an enumerable of canvas object that are hit in reverse painting order
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-getCanvasObjects(Point)">Online Documentation</a>
 */
 final   fun getCanvasObjects( location: Point ):IEnumerable<ICanvasObject>
/**
 * Determines the animation duration for a viewport animation.
 * @param [newCenter] The new center of the viewport.
 * @param [newZoom] The new zoom factor.
 * @param [viewportChanges] The kind of viewport change that triggered this method. Even though [ViewportChanges] supports multiple values as bitwise flags, only one of them is ever passed here.
 * @return A [TimeSpan] indicating the desired animation duration.
 * @see [animatedViewportChanges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-getViewportAnimationDuration">Online Documentation</a>
 */
 open protected   fun getViewportAnimationDuration( newCenter: Point ,
 newZoom: Double ,
 viewportChanges: ViewportChanges ):TimeSpan
/**
 * Gets the [Visual] that is currently visualizing the given [ICanvasObject].
 * @param [canvasObject] The canvas object.
 * @return The [Visual] that is currently used by the `canvasObject`. This may be `null` if the given `canvasObject` is currently not visible.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-getVisual">Online Documentation</a>
 */
 final   fun getVisual( canvasObject: ICanvasObject ):Visual?
/**
 * Retrieves the [IVisualCreator] for a given [ICanvasObject].
 * @param [canvasObject] the canvas object to query the visual creator implementation from
 * @return an instance of the visual creator interface
 * @see [ICanvasObjectDescriptor.getVisualCreator]
 * @see [VoidVisualCreator.INSTANCE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-getVisualCreator">Online Documentation</a>
 */
 final   fun getVisualCreator( canvasObject: ICanvasObject ):IVisualCreator
/**
 * Assures that the [content rectangle][contentRect] encompasses the given rectangle.
 * @param [rectangle] the rectangle that should be included in the content rectangle
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-growContentRect">Online Documentation</a>
 */
 final   fun growContentRect( rectangle: Rect )
/**
 * Enumerates all hit elements in the canvas below the given group that are accepted by a given filter.
 * @param [location] the coordinates to perform the hit test at
 * @param [root] the root of the scene graph to use
 * @param [filter] The predicate that decides whether a given canvas object should be considered for testing at all or `null`.
 * @return a live enumeration of the elements that are hit
 * @see [IHitTestable][yfiles.input.IHitTestable]
 * @see [hitTestRadius]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-hitElementsAt(Point,ICanvasObjectGroup,system.Predicate)">Online Documentation</a>
 */
 final   fun hitElementsAt( location: Point ,
 root: ICanvasObjectGroup?  = definedExternally,
 filter: Predicate<ICanvasObject>?  = definedExternally):IEnumerable<ICanvasObject>
/**
 * Enumerates all hit elements in the canvas below the given group that are accepted by a given filter using a specific [ICanvasContext] as the argument to the [IHitTestable.isHit][yfiles.input.IHitTestable.isHit] method.
 * @param [context] The context instance to pass to [IHitTestable.isHit][yfiles.input.IHitTestable.isHit].
 * @param [location] the coordinates to perform the hit test at
 * @param [root] the root of the scene graph to use
 * @param [filter] The predicate that decides whether a given canvas object should be considered for testing at all or `null`.
 * @return a live enumeration of the elements that are hit
 * @see [IHitTestable][yfiles.input.IHitTestable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-hitElementsAt(IInputModeContext,Point,ICanvasObjectGroup,system.Predicate)">Online Documentation</a>
 */
 final   fun hitElementsAt( context: IInputModeContext ,
 location: Point ,
 root: ICanvasObjectGroup?  = definedExternally,
 filter: Predicate<ICanvasObject>?  = definedExternally):IEnumerable<ICanvasObject>
/**
 * Used by the default implementation of [inputModeContext] to resolve [ILookup.lookup] calls.
 * @param [type] The Type to query
 * @return The result of the query.
 * @see [IInputModeContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-inputModeContextLookup">Online Documentation</a>
 */
 open protected   fun <T : YObject>inputModeContextLookup( type: YClass<T> ):T?
/**
 * Converts intermediate coordinates to view coordinates expressed in the control's coordinate system.
 * @param [intermediatePoint] the coordinates in the view coordinate system
 * @return The coordinates in pixels relative to the controls upper left corner in the view coordinate system.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-intermediateToViewCoordinates">Online Documentation</a>
 */
 final   fun intermediateToViewCoordinates( intermediatePoint: Point ):Point
/**
 * Converts intermediate coordinates to world coordinates.
 * @param [intermediatePoint] Coordinates expressed in the intermediate coordinate system.
 * @return The coordinates expressed in the world coordinate system.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-intermediateToWorldCoordinates">Online Documentation</a>
 */
 final   fun intermediateToWorldCoordinates( intermediatePoint: Point ):Point
/**
 * Invalidates this instance and marks it as in need for [an update][updateVisual].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-invalidate">Online Documentation</a>
 */
 final   fun invalidate()
/**
 * Calculates the hit tests a given canvas object in the scene graph.
 * @param [canvasObject] the canvas object to query the bounds from
 * @param [location] the coordinates of the query in the world coordinate system
 * @return whether the canvas object is hit at the given coordinates
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-isHit">Online Documentation</a>
 */
 final   fun isHit( canvasObject: ICanvasObject ,
 location: Point ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * Calls `event.preventDefault()` for each `contextMenu` event that occurs on this instance.
 * @param [event] The event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-maybePreventContextMenuDefault">Online Documentation</a>
 */
 open protected   fun maybePreventContextMenuDefault( event: Event )
/**
 * Calls `event.preventDefault()` if [captureAllPointerInput] is enabled.
 * @param [event] The event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-maybePreventPointerDefault">Online Documentation</a>
 */
 open protected   fun maybePreventPointerDefault( event: Event )
/**
 * This method will be called when the mouse wheel was turned and if the [mouseWheelBehavior] property is set to [MouseWheelBehaviors.SCROLL].
 * @param [event] the event describing the action
 * @see [mouseWheelBehavior]
 * @see [mouseWheelScrollFactor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-mouseWheelScroll">Online Documentation</a>
 */
 open protected   fun mouseWheelScroll( event: MouseEventArgs )
/**
 * This method will be called when the mouse wheel was turned and if the [mouseWheelBehavior] property is set to [MouseWheelBehaviors.ZOOM].
 * @param [event] the event describing the action
 * @see [mouseWheelBehavior]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-mouseWheelZoom">Online Documentation</a>
 */
 open protected   fun mouseWheelZoom( event: MouseEventArgs )
/**
 * Raises the [PrepareRenderContext].
 * @param [event] The event arguments to raise.
 * @see [addPrepareRenderContextListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-raisePrepareRenderContextEvent">Online Documentation</a>
 */
 open protected   fun raisePrepareRenderContextEvent( event: PrepareRenderContextEventArgs )
/**
 * Raises the [UpdatedVisual].
 * @see [addUpdatedVisualListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-raiseUpdatedVisualEvent">Online Documentation</a>
 */
 open protected   fun raiseUpdatedVisualEvent()
/**
 * Raises the [UpdatingVisual].
 * @see [addUpdatingVisualListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-raiseUpdatingVisualEvent">Online Documentation</a>
 */
 open protected   fun raiseUpdatingVisualEvent()
/**
 * Adds a callback to the invocation chain and triggers the chain's execution.
 * @param [callback] The function that should be executed.
 * @param [args] The arguments with which the function should be called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-schedule">Online Documentation</a>
 */
 final   fun schedule( callback: () -> Unit ,
vararg  args: Any )
/**
 * Sets the content rectangle.
 * @see [contentRect]
 * @see [horizontalScrollBarPolicy]
 * @see [verticalScrollBarPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-setContentRect">Online Documentation</a>
 */
 final   fun setContentRect( x: Double ,
 y: Double ,
 w: Double ,
 h: Double )
/**
 * Stops the mouse capture and returns to normal event capturing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-stopMouseCapture">Online Documentation</a>
 */
 final   fun stopMouseCapture()
/**
 * Converts view coordinates to the <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/CSSOM_View/Coordinate_systems">html page coordinates</a>.
 * @param [viewLocation] The view coordinates to convert.
 * @return The coordinates in the html document's coordinate system.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-toPageFromView">Online Documentation</a>
 */
 final   fun toPageFromView( viewLocation: Point ):Point
/**
 * Converts world coordinates to view coordinates expressed in the control's coordinate system.
 * @param [worldPoint] Coordinates in the world coordinate system.
 * @return The coordinates in pixels relative to the control's upper left corner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-toViewCoordinates">Online Documentation</a>
 */
 final   fun toViewCoordinates( worldPoint: Point ):Point
/**
 * Converts <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/CSSOM_View/Coordinate_systems">html page coordinates</a> to view coordinates.
 * @param [pageLocation] The html page coordinates to convert.
 * @return The view coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-toViewFromPage">Online Documentation</a>
 */
 final   fun toViewFromPage( pageLocation: Point ):Point
/**
 * Converts coordinates expressed in the component's coordinate system to world coordinates.
 * @param [viewPoint] The coordinates in pixels relative to the component's upper left corner.
 * @return The coordinates expressed in the world coordinate system.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-toWorldCoordinates">Online Documentation</a>
 */
 final   fun toWorldCoordinates( viewPoint: Point ):Point
/**
 * Converts <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/CSSOM_View/Coordinate_systems">html page coordinates</a> to world coordinates.
 * @param [pageLocation] The html page coordinates to convert.
 * @return The world coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-toWorldFromPage">Online Documentation</a>
 */
 final   fun toWorldFromPage( pageLocation: Point ):Point
/**
 * Updates the [contentRect] to encompass the bounds by all elements in the current scene graph plus the given margins.
 * @see [IBoundsProvider]
 * @see [contentRect]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-updateContentRect">Online Documentation</a>
 */
 open   fun updateContentRect( margins: Insets?  = definedExternally,
 group: ICanvasObjectGroup?  = definedExternally)
/**
 * Updates the visual tree that displays the contents of this control.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-updateVisual">Online Documentation</a>
 */
 open   fun updateVisual()
/**
 * Invalidates this instance and marks it as in need for [an update][updateVisual].
 * @return A Promise that will resolve once the component has been [updated][updateVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-updateVisualAsync">Online Documentation</a>
 */
 final   fun updateVisualAsync():Promise<Void>
/**
 * Converts view coordinates to intermediate coordinates, effectively canceling any [projection] if set.
 * @param [viewPoint] the coordinates in the view coordinate system
 * @return The coordinates in pixels relative to the controls upper left corner in the intermediate coordinate system
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-viewToIntermediateCoordinates">Online Documentation</a>
 */
 final   fun viewToIntermediateCoordinates( viewPoint: Point ):Point
/**
 * Converts world coordinates to the component's coordinate system before the [projection] is applied.
 * @param [worldPoint] the coordinates in the world coordinate system
 * @return Coordinates expressed in pixels relative to the controls upper left corner in the intermediate coordinate system.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-worldToIntermediateCoordinates">Online Documentation</a>
 */
 final   fun worldToIntermediateCoordinates( worldPoint: Point ):Point
/**
 * Sets the zoom level and viewport center so that the given rectangle in world coordinates fits the viewport.
 * @param [bounds] The coordinates of the rectangle to zoom to.
 * @see [zoomTo]
 * @see [zoomToAnimated]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-zoomTo(Rect)">Online Documentation</a>
 */
 open   fun zoomTo( bounds: Rect )
/**
 * Sets the zoom level and viewport [center] to the given values.
 * @param [center] The new center of the viewport in world coordinates.
 * @param [zoom] The new zoom level.
 * @see [zoomTo]
 * @see [zoomToAnimated]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-zoomTo(Point,number)">Online Documentation</a>
 */
 open   fun zoomTo( center: Point ,
 zoom: Double )
/**
 * Transitions the viewport in an animated fashion to a new zoom level and center so that the given rectangle in world coordinates fits the viewport.
 * @param [bounds] The coordinates of the rectangle to zoom to.
 * @return A Promise that will resolve once the animation is finished.
 * @see [zoomTo]
 * @see [zoomToAnimated]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-zoomToAnimated(Rect)">Online Documentation</a>
 */
 open   fun zoomToAnimated( bounds: Rect ):Promise<Void>
/**
 * Transitions to a new zoom level and viewport center in an animated fashion.
 * @param [center] The new center of the viewport in world coordinates.
 * @param [zoom] The new zoom level.
 * @return A Promise that will resolve once the animation is finished.
 * @see [zoomToAnimated]
 * @see [zoomTo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-zoomToAnimated(Point,number)">Online Documentation</a>
 */
 open   fun zoomToAnimated( center: Point ,
 zoom: Double ):Promise<Void>
/**
 * Occurs when the [content rectangle][contentRect] has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23ContentRectChanged">Online Documentation</a>
 */
fun addContentRectChangedListener(listener: EventHandler)
fun removeContentRectChangedListener(listener: EventHandler)

/**
 * Occurs when the [margins for the fit content operation][contentMargins] have been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23ContentMarginsChanged">Online Documentation</a>
 */
fun addContentMarginsChangedListener(listener: EventHandler)
fun removeContentMarginsChangedListener(listener: EventHandler)

/**
 * Occurs when the mouse has exited the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23MouseLeave">Online Documentation</a>
 */
fun addMouseLeaveListener(listener: EventHandler1<MouseEventArgs>)
fun removeMouseLeaveListener(listener: EventHandler1<MouseEventArgs>)

/**
 * Occurs when the mouse has entered the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23MouseEnter">Online Documentation</a>
 */
fun addMouseEnterListener(listener: EventHandler1<MouseEventArgs>)
fun removeMouseEnterListener(listener: EventHandler1<MouseEventArgs>)

/**
 * Occurs when the mouse has been moved in world coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23MouseMove">Online Documentation</a>
 */
fun addMouseMoveListener(listener: EventHandler1<MouseEventArgs>)
fun removeMouseMoveListener(listener: EventHandler1<MouseEventArgs>)

/**
 * Occurs when a mouse button has been pressed, i.e., on `mousedown`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23MouseDown">Online Documentation</a>
 */
fun addMouseDownListener(listener: EventHandler1<MouseEventArgs>)
fun removeMouseDownListener(listener: EventHandler1<MouseEventArgs>)

/**
 * Occurs when the mouse is being moved while at least one of the mouse buttons is pressed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23MouseDrag">Online Documentation</a>
 */
fun addMouseDragListener(listener: EventHandler1<MouseEventArgs>)
fun removeMouseDragListener(listener: EventHandler1<MouseEventArgs>)

/**
 * Occurs when the mouse button has been released, i.e., on `mouseup`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23MouseUp">Online Documentation</a>
 */
fun addMouseUpListener(listener: EventHandler1<MouseEventArgs>)
fun removeMouseUpListener(listener: EventHandler1<MouseEventArgs>)

/**
 * Occurs when the mouse capture has been lost.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23MouseLostCapture">Online Documentation</a>
 */
fun addMouseLostCaptureListener(listener: EventHandler1<MouseEventArgs>)
fun removeMouseLostCaptureListener(listener: EventHandler1<MouseEventArgs>)

/**
 * Occurs when the mouse wheel has turned.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23MouseWheel">Online Documentation</a>
 */
fun addMouseWheelListener(listener: EventHandler1<MouseEventArgs>)
fun removeMouseWheelListener(listener: EventHandler1<MouseEventArgs>)

/**
 * Occurs when the user clicked the mouse.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23MouseClick">Online Documentation</a>
 */
fun addMouseClickListener(listener: EventHandler1<MouseEventArgs>)
fun removeMouseClickListener(listener: EventHandler1<MouseEventArgs>)

/**
 * Occurs when keys are being pressed, i.e., on `keydown`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23KeyDown">Online Documentation</a>
 */
fun addKeyDownListener(listener: EventHandler1<KeyEventArgs>)
fun removeKeyDownListener(listener: EventHandler1<KeyEventArgs>)

/**
 * Occurs when keys are being typed, i.e., on `keypress`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23KeyPress">Online Documentation</a>
 */
fun addKeyPressListener(listener: EventHandler1<KeyEventArgs>)
fun removeKeyPressListener(listener: EventHandler1<KeyEventArgs>)

/**
 * Occurs when keys are being released, i.e., on `keyup`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23KeyUp">Online Documentation</a>
 */
fun addKeyUpListener(listener: EventHandler1<KeyEventArgs>)
fun removeKeyUpListener(listener: EventHandler1<KeyEventArgs>)

/**
 * Occurs when the [viewport] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23ViewportChanged">Online Documentation</a>
 */
fun addViewportChangedListener(listener: EventHandler1<PropertyChangedEventArgs>)
fun removeViewportChangedListener(listener: EventHandler1<PropertyChangedEventArgs>)

/**
 * Occurs when a finger has been put on the touch screen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23TouchDown">Online Documentation</a>
 */
fun addTouchDownListener(listener: EventHandler1<TouchEventArgs>)
fun removeTouchDownListener(listener: EventHandler1<TouchEventArgs>)

/**
 * Occurs when a finger has been removed from the touch screen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23TouchUp">Online Documentation</a>
 */
fun addTouchUpListener(listener: EventHandler1<TouchEventArgs>)
fun removeTouchUpListener(listener: EventHandler1<TouchEventArgs>)

/**
 * Occurs when a finger has been moved on the touch screen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23TouchMove">Online Documentation</a>
 */
fun addTouchMoveListener(listener: EventHandler1<TouchEventArgs>)
fun removeTouchMoveListener(listener: EventHandler1<TouchEventArgs>)

/**
 * Occurs when a finger on the touch screen has entered the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23TouchEnter">Online Documentation</a>
 */
fun addTouchEnterListener(listener: EventHandler1<TouchEventArgs>)
fun removeTouchEnterListener(listener: EventHandler1<TouchEventArgs>)

/**
 * Occurs when a finger on the touch screen has exited the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23TouchLeave">Online Documentation</a>
 */
fun addTouchLeaveListener(listener: EventHandler1<TouchEventArgs>)
fun removeTouchLeaveListener(listener: EventHandler1<TouchEventArgs>)

/**
 * Occurs when the touch capture has been lost.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23TouchLostCapture">Online Documentation</a>
 */
fun addTouchLostCaptureListener(listener: EventHandler1<TouchEventArgs>)
fun removeTouchLostCaptureListener(listener: EventHandler1<TouchEventArgs>)

/**
 * Occurs when the user performed a tap gesture with a finger on the touch screen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23TouchClick">Online Documentation</a>
 */
fun addTouchClickListener(listener: EventHandler1<TouchEventArgs>)
fun removeTouchClickListener(listener: EventHandler1<TouchEventArgs>)

/**
 * Occurs when the user performed a long press gesture with a finger on the touch screen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23TouchLongPress">Online Documentation</a>
 */
fun addTouchLongPressListener(listener: EventHandler1<TouchEventArgs>)
fun removeTouchLongPressListener(listener: EventHandler1<TouchEventArgs>)

/**
 * Occurs when the [inputMode] property is changed.
 * @see [inputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23InputModeChanged">Online Documentation</a>
 */
fun addInputModeChangedListener(listener: EventHandler)
fun removeInputModeChangedListener(listener: EventHandler)

/**
 * Occurs when the value of the [zoom] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23ZoomChanged">Online Documentation</a>
 */
fun addZoomChangedListener(listener: EventHandler)
fun removeZoomChangedListener(listener: EventHandler)

/**
 * Occurs after the [visual tree has been updated][updateVisual].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23UpdatedVisual">Online Documentation</a>
 */
fun addUpdatedVisualListener(listener: EventHandler)
fun removeUpdatedVisualListener(listener: EventHandler)

/**
 * Occurs before the [visual tree is updated][updateVisual].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23UpdatingVisual">Online Documentation</a>
 */
fun addUpdatingVisualListener(listener: EventHandler1<EventArgs>)
fun removeUpdatingVisualListener(listener: EventHandler1<EventArgs>)

/**
 * Occurs when the [contentGroup] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23ContentGroupChanged">Online Documentation</a>
 */
fun addContentGroupChangedListener(listener: PropertyChangedEventHandler)
fun removeContentGroupChangedListener(listener: PropertyChangedEventHandler)

/**
 * Occurs when the [focusGroup] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23FocusGroupChanged">Online Documentation</a>
 */
fun addFocusGroupChangedListener(listener: PropertyChangedEventHandler)
fun removeFocusGroupChangedListener(listener: PropertyChangedEventHandler)

/**
 * Occurs when the [highlightGroup] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23HighlightGroupChanged">Online Documentation</a>
 */
fun addHighlightGroupChangedListener(listener: PropertyChangedEventHandler)
fun removeHighlightGroupChangedListener(listener: PropertyChangedEventHandler)

/**
 * Occurs when the [selectionGroup] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23SelectionGroupChanged">Online Documentation</a>
 */
fun addSelectionGroupChangedListener(listener: PropertyChangedEventHandler)
fun removeSelectionGroupChangedListener(listener: PropertyChangedEventHandler)

/**
 * Occurs when the [inputModeGroup] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23InputModeGroupChanged">Online Documentation</a>
 */
fun addInputModeGroupChangedListener(listener: PropertyChangedEventHandler)
fun removeInputModeGroupChangedListener(listener: PropertyChangedEventHandler)

/**
 * Occurs when the [backgroundGroup] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23BackgroundGroupChanged">Online Documentation</a>
 */
fun addBackgroundGroupChangedListener(listener: PropertyChangedEventHandler)
fun removeBackgroundGroupChangedListener(listener: PropertyChangedEventHandler)

/**
 * Occurs before the visual tree is painted to prepare the [IRenderContext].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23PrepareRenderContext">Online Documentation</a>
 */
fun addPrepareRenderContextListener(listener: EventHandler1<PrepareRenderContextEventArgs>)
fun removePrepareRenderContextListener(listener: EventHandler1<PrepareRenderContextEventArgs>)

/**
 * Occurs when the [inputModeContext] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23InputModeContextChanged">Online Documentation</a>
 */
fun addInputModeContextChangedListener(listener: EventHandler1<PropertyChangedEventArgs>)
fun removeInputModeContextChangedListener(listener: EventHandler1<PropertyChangedEventArgs>)

/**
 * Occurs when the size of this component is changed.
 * @see [sizeChangedDetection]
 * @see [SizeChangedDetectionMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23SizeChanged">Online Documentation</a>
 */
fun addSizeChangedListener(listener: EventHandler1<SizeChangedEventArgs>)
fun removeSizeChangedListener(listener: EventHandler1<SizeChangedEventArgs>)

companion object : ClassMetadata<CanvasComponent> {
/**
 * Gets or sets the interval of the timer that runs to detect size changes as a [TimeSpan].
 * @see [addSizeChangedListener]
 * @see [sizeChangedDetection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23sizeChangedTimerInterval">Online Documentation</a>
 */
final var sizeChangedTimerInterval: TimeSpan
/**
 * Gets the [CanvasComponent] instance that is associated with the given element, or null.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-getComponent">Online Documentation</a>
 */
 final   fun Element?.getComponent():CanvasComponent?
}
}

/**
 * Occurs when the [content rectangle][contentRect] has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23ContentRectChanged">Online Documentation</a>
 */
inline fun  CanvasComponent.addContentRectChangedHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler = { _, _ -> handler() }
    addContentRectChangedListener(listener)
    return { removeContentRectChangedListener(listener) }
}
/**
 * Occurs when the [margins for the fit content operation][contentMargins] have been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23ContentMarginsChanged">Online Documentation</a>
 */
inline fun  CanvasComponent.addContentMarginsChangedHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler = { _, _ -> handler() }
    addContentMarginsChangedListener(listener)
    return { removeContentMarginsChangedListener(listener) }
}
/**
 * Occurs when the mouse has exited the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23MouseLeave">Online Documentation</a>
 */
inline fun  CanvasComponent.addMouseLeaveHandler(
    crossinline handler: (event:MouseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<MouseEventArgs> = { _, event -> handler(event) }
    addMouseLeaveListener(listener)
    return { removeMouseLeaveListener(listener) }
}
/**
 * Occurs when the mouse has entered the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23MouseEnter">Online Documentation</a>
 */
inline fun  CanvasComponent.addMouseEnterHandler(
    crossinline handler: (event:MouseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<MouseEventArgs> = { _, event -> handler(event) }
    addMouseEnterListener(listener)
    return { removeMouseEnterListener(listener) }
}
/**
 * Occurs when the mouse has been moved in world coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23MouseMove">Online Documentation</a>
 */
inline fun  CanvasComponent.addMouseMoveHandler(
    crossinline handler: (event:MouseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<MouseEventArgs> = { _, event -> handler(event) }
    addMouseMoveListener(listener)
    return { removeMouseMoveListener(listener) }
}
/**
 * Occurs when a mouse button has been pressed, i.e., on `mousedown`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23MouseDown">Online Documentation</a>
 */
inline fun  CanvasComponent.addMouseDownHandler(
    crossinline handler: (event:MouseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<MouseEventArgs> = { _, event -> handler(event) }
    addMouseDownListener(listener)
    return { removeMouseDownListener(listener) }
}
/**
 * Occurs when the mouse is being moved while at least one of the mouse buttons is pressed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23MouseDrag">Online Documentation</a>
 */
inline fun  CanvasComponent.addMouseDragHandler(
    crossinline handler: (event:MouseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<MouseEventArgs> = { _, event -> handler(event) }
    addMouseDragListener(listener)
    return { removeMouseDragListener(listener) }
}
/**
 * Occurs when the mouse button has been released, i.e., on `mouseup`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23MouseUp">Online Documentation</a>
 */
inline fun  CanvasComponent.addMouseUpHandler(
    crossinline handler: (event:MouseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<MouseEventArgs> = { _, event -> handler(event) }
    addMouseUpListener(listener)
    return { removeMouseUpListener(listener) }
}
/**
 * Occurs when the mouse capture has been lost.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23MouseLostCapture">Online Documentation</a>
 */
inline fun  CanvasComponent.addMouseLostCaptureHandler(
    crossinline handler: (event:MouseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<MouseEventArgs> = { _, event -> handler(event) }
    addMouseLostCaptureListener(listener)
    return { removeMouseLostCaptureListener(listener) }
}
/**
 * Occurs when the mouse wheel has turned.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23MouseWheel">Online Documentation</a>
 */
inline fun  CanvasComponent.addMouseWheelHandler(
    crossinline handler: (event:MouseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<MouseEventArgs> = { _, event -> handler(event) }
    addMouseWheelListener(listener)
    return { removeMouseWheelListener(listener) }
}
/**
 * Occurs when the user clicked the mouse.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23MouseClick">Online Documentation</a>
 */
inline fun  CanvasComponent.addMouseClickHandler(
    crossinline handler: (event:MouseEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<MouseEventArgs> = { _, event -> handler(event) }
    addMouseClickListener(listener)
    return { removeMouseClickListener(listener) }
}
/**
 * Occurs when keys are being pressed, i.e., on `keydown`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23KeyDown">Online Documentation</a>
 */
inline fun  CanvasComponent.addKeyDownHandler(
    crossinline handler: (event:KeyEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<KeyEventArgs> = { _, event -> handler(event) }
    addKeyDownListener(listener)
    return { removeKeyDownListener(listener) }
}
/**
 * Occurs when keys are being typed, i.e., on `keypress`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23KeyPress">Online Documentation</a>
 */
inline fun  CanvasComponent.addKeyPressHandler(
    crossinline handler: (event:KeyEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<KeyEventArgs> = { _, event -> handler(event) }
    addKeyPressListener(listener)
    return { removeKeyPressListener(listener) }
}
/**
 * Occurs when keys are being released, i.e., on `keyup`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23KeyUp">Online Documentation</a>
 */
inline fun  CanvasComponent.addKeyUpHandler(
    crossinline handler: (event:KeyEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<KeyEventArgs> = { _, event -> handler(event) }
    addKeyUpListener(listener)
    return { removeKeyUpListener(listener) }
}
/**
 * Occurs when the [viewport] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23ViewportChanged">Online Documentation</a>
 */
inline fun  CanvasComponent.addViewportChangedHandler(
    crossinline handler: (propertyName:String) -> Unit
): () -> Unit {
    val listener: EventHandler1<PropertyChangedEventArgs> = { _, event -> handler(event.propertyName) }
    addViewportChangedListener(listener)
    return { removeViewportChangedListener(listener) }
}
/**
 * Occurs when a finger has been put on the touch screen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23TouchDown">Online Documentation</a>
 */
inline fun  CanvasComponent.addTouchDownHandler(
    crossinline handler: (event:TouchEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<TouchEventArgs> = { _, event -> handler(event) }
    addTouchDownListener(listener)
    return { removeTouchDownListener(listener) }
}
/**
 * Occurs when a finger has been removed from the touch screen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23TouchUp">Online Documentation</a>
 */
inline fun  CanvasComponent.addTouchUpHandler(
    crossinline handler: (event:TouchEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<TouchEventArgs> = { _, event -> handler(event) }
    addTouchUpListener(listener)
    return { removeTouchUpListener(listener) }
}
/**
 * Occurs when a finger has been moved on the touch screen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23TouchMove">Online Documentation</a>
 */
inline fun  CanvasComponent.addTouchMoveHandler(
    crossinline handler: (event:TouchEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<TouchEventArgs> = { _, event -> handler(event) }
    addTouchMoveListener(listener)
    return { removeTouchMoveListener(listener) }
}
/**
 * Occurs when a finger on the touch screen has entered the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23TouchEnter">Online Documentation</a>
 */
inline fun  CanvasComponent.addTouchEnterHandler(
    crossinline handler: (event:TouchEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<TouchEventArgs> = { _, event -> handler(event) }
    addTouchEnterListener(listener)
    return { removeTouchEnterListener(listener) }
}
/**
 * Occurs when a finger on the touch screen has exited the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23TouchLeave">Online Documentation</a>
 */
inline fun  CanvasComponent.addTouchLeaveHandler(
    crossinline handler: (event:TouchEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<TouchEventArgs> = { _, event -> handler(event) }
    addTouchLeaveListener(listener)
    return { removeTouchLeaveListener(listener) }
}
/**
 * Occurs when the touch capture has been lost.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23TouchLostCapture">Online Documentation</a>
 */
inline fun  CanvasComponent.addTouchLostCaptureHandler(
    crossinline handler: (event:TouchEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<TouchEventArgs> = { _, event -> handler(event) }
    addTouchLostCaptureListener(listener)
    return { removeTouchLostCaptureListener(listener) }
}
/**
 * Occurs when the user performed a tap gesture with a finger on the touch screen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23TouchClick">Online Documentation</a>
 */
inline fun  CanvasComponent.addTouchClickHandler(
    crossinline handler: (event:TouchEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<TouchEventArgs> = { _, event -> handler(event) }
    addTouchClickListener(listener)
    return { removeTouchClickListener(listener) }
}
/**
 * Occurs when the user performed a long press gesture with a finger on the touch screen.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23TouchLongPress">Online Documentation</a>
 */
inline fun  CanvasComponent.addTouchLongPressHandler(
    crossinline handler: (event:TouchEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<TouchEventArgs> = { _, event -> handler(event) }
    addTouchLongPressListener(listener)
    return { removeTouchLongPressListener(listener) }
}
/**
 * Occurs when the [inputMode] property is changed.
 * @see [inputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23InputModeChanged">Online Documentation</a>
 */
inline fun  CanvasComponent.addInputModeChangedHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler = { _, _ -> handler() }
    addInputModeChangedListener(listener)
    return { removeInputModeChangedListener(listener) }
}
/**
 * Occurs when the value of the [zoom] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23ZoomChanged">Online Documentation</a>
 */
inline fun  CanvasComponent.addZoomChangedHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler = { _, _ -> handler() }
    addZoomChangedListener(listener)
    return { removeZoomChangedListener(listener) }
}
/**
 * Occurs after the [visual tree has been updated][updateVisual].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23UpdatedVisual">Online Documentation</a>
 */
inline fun  CanvasComponent.addUpdatedVisualHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler = { _, _ -> handler() }
    addUpdatedVisualListener(listener)
    return { removeUpdatedVisualListener(listener) }
}
/**
 * Occurs before the [visual tree is updated][updateVisual].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23UpdatingVisual">Online Documentation</a>
 */
inline fun  CanvasComponent.addUpdatingVisualHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addUpdatingVisualListener(listener)
    return { removeUpdatingVisualListener(listener) }
}
/**
 * Occurs when the [contentGroup] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23ContentGroupChanged">Online Documentation</a>
 */
inline fun  CanvasComponent.addContentGroupChangedHandler(
    crossinline handler: (propertyName:String) -> Unit
): () -> Unit {
    val listener: PropertyChangedEventHandler = { _, event -> handler(event.propertyName) }
    addContentGroupChangedListener(listener)
    return { removeContentGroupChangedListener(listener) }
}
/**
 * Occurs when the [focusGroup] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23FocusGroupChanged">Online Documentation</a>
 */
inline fun  CanvasComponent.addFocusGroupChangedHandler(
    crossinline handler: (propertyName:String) -> Unit
): () -> Unit {
    val listener: PropertyChangedEventHandler = { _, event -> handler(event.propertyName) }
    addFocusGroupChangedListener(listener)
    return { removeFocusGroupChangedListener(listener) }
}
/**
 * Occurs when the [highlightGroup] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23HighlightGroupChanged">Online Documentation</a>
 */
inline fun  CanvasComponent.addHighlightGroupChangedHandler(
    crossinline handler: (propertyName:String) -> Unit
): () -> Unit {
    val listener: PropertyChangedEventHandler = { _, event -> handler(event.propertyName) }
    addHighlightGroupChangedListener(listener)
    return { removeHighlightGroupChangedListener(listener) }
}
/**
 * Occurs when the [selectionGroup] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23SelectionGroupChanged">Online Documentation</a>
 */
inline fun  CanvasComponent.addSelectionGroupChangedHandler(
    crossinline handler: (propertyName:String) -> Unit
): () -> Unit {
    val listener: PropertyChangedEventHandler = { _, event -> handler(event.propertyName) }
    addSelectionGroupChangedListener(listener)
    return { removeSelectionGroupChangedListener(listener) }
}
/**
 * Occurs when the [inputModeGroup] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23InputModeGroupChanged">Online Documentation</a>
 */
inline fun  CanvasComponent.addInputModeGroupChangedHandler(
    crossinline handler: (propertyName:String) -> Unit
): () -> Unit {
    val listener: PropertyChangedEventHandler = { _, event -> handler(event.propertyName) }
    addInputModeGroupChangedListener(listener)
    return { removeInputModeGroupChangedListener(listener) }
}
/**
 * Occurs when the [backgroundGroup] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23BackgroundGroupChanged">Online Documentation</a>
 */
inline fun  CanvasComponent.addBackgroundGroupChangedHandler(
    crossinline handler: (propertyName:String) -> Unit
): () -> Unit {
    val listener: PropertyChangedEventHandler = { _, event -> handler(event.propertyName) }
    addBackgroundGroupChangedListener(listener)
    return { removeBackgroundGroupChangedListener(listener) }
}
/**
 * Occurs before the visual tree is painted to prepare the [IRenderContext].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23PrepareRenderContext">Online Documentation</a>
 */
inline fun  CanvasComponent.addPrepareRenderContextHandler(
    crossinline handler: (event:PrepareRenderContextEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<PrepareRenderContextEventArgs> = { _, event -> handler(event) }
    addPrepareRenderContextListener(listener)
    return { removePrepareRenderContextListener(listener) }
}
/**
 * Occurs when the [inputModeContext] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23InputModeContextChanged">Online Documentation</a>
 */
inline fun  CanvasComponent.addInputModeContextChangedHandler(
    crossinline handler: (propertyName:String) -> Unit
): () -> Unit {
    val listener: EventHandler1<PropertyChangedEventArgs> = { _, event -> handler(event.propertyName) }
    addInputModeContextChangedListener(listener)
    return { removeInputModeContextChangedListener(listener) }
}
/**
 * Occurs when the size of this component is changed.
 * @see [sizeChangedDetection]
 * @see [SizeChangedDetectionMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23SizeChanged">Online Documentation</a>
 */
inline fun  CanvasComponent.addSizeChangedHandler(
    crossinline handler: (event:SizeChangedEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<SizeChangedEventArgs> = { _, event -> handler(event) }
    addSizeChangedListener(listener)
    return { removeSizeChangedListener(listener) }
}
