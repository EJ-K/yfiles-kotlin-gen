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
import yfiles.collections.IContextLookup
import yfiles.collections.IContextLookupChainLink
import yfiles.collections.IEnumerable
import yfiles.collections.ILookup
import yfiles.collections.LookupDecorator
import yfiles.geometry.Insets
import yfiles.geometry.Matrix
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.input.Command
import yfiles.input.EventRecognizer
import yfiles.input.IInputMode
import yfiles.input.IInputModeContext
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs
import yfiles.lang.EventHandler
import yfiles.lang.EventHandler1
import yfiles.lang.Func4
import yfiles.lang.IClassMetadata
import yfiles.lang.IEventDispatcher
import yfiles.lang.PropertyChangedEventArgs
import yfiles.lang.TimeSpan

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
open external class CanvasComponent () : ILookup, IEventDispatcher {
  /**
   * Creates a new instance of [CanvasComponent] for the provided `htmlElement`.
   * @param [htmlElement] The existing element to use for rendering the canvas into. All its child nodes are added to the [overlayPanel][CanvasComponent]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-constructor-CanvasComponent(HTMLElement)">Online Documentation</a>
   */ constructor(
    htmlElement: HTMLElement,
  )
  /**
   * Creates a new instance of [CanvasComponent] using the `div` element that is specified by the `selector`.
   * @param [selector] The CSS selector or id for an existing `div` element. All child nodes of this element are added to the [overlayPanel][CanvasComponent]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-constructor-CanvasComponent(string)">Online Documentation</a>
   */ constructor(
    selector: String,
  )
  /**
   * Gets or sets a combination of viewport changes that should be performed in an animated fashion.
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
   * Gets or sets a property that causes the control to automatically pan the view when the mouse is dragged outside the bounds of the control.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23autoScrollOnBounds">Online Documentation</a>
   */
  final var autoScrollOnBounds: Boolean
  
  /**
   * Gets or sets the distance from the edge of the viewport, in which auto-scrolling should happen.
   * @see [autoScrollOnBounds]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23autoScrollPadding">Online Documentation</a>
   */
  final var autoScrollPadding: Insets
  
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
   * The default is [ALT_IS_DOWN][EventRecognizers], since by default shift will trigger horizontal panning and ctrl will trigger vertical panning.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23centerZoomEventRecognizer">Online Documentation</a>
   */
  final var centerZoomEventRecognizer: EventRecognizer
  
  /**
   * Gets and sets the rectangle in world coordinates that holds the contents.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23contentBounds">Online Documentation</a>
   */
  final var contentBounds: Rect
  
  /**
   * Gets and sets the margins in view coordinates that should be used by the [fitContent][CanvasComponent] operation or zoom commands which zoom to a given rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23contentMargins">Online Documentation</a>
   */
  final var contentMargins: Insets
  
  /**
   * Gets or sets the scaling factor for HTML canvas and WebGL rendering.
   * 
   * The default value is determined automatically. Adjust this value if you encounter any problems with HiDPI rendering etc.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23devicePixelRatio">Online Documentation</a>
   */
  final var devicePixelRatio: Double
  
  /**
   * Gets or sets the value of the double-click time.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23doubleClickTime">Online Documentation</a>
   */
  final var doubleClickTime: TimeSpan
  
  /**
   * Gets the [dropTarget][CanvasComponent] associated with this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23dropTarget">Online Documentation</a>
   */
  final val dropTarget: DropTarget
  
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
   * Gets or sets the radius of the area around the pointer in view coordinates in which an [IHitTestable][yfiles.input.IHitTestable] may lie to be considered a valid hit.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23hitTestRadius">Online Documentation</a>
   */
  final var hitTestRadius: Double
  
  /**
   * Gets or sets the visibility policy for the horizontal scrollbar.
   * @see [MoveViewportInputMode][yfiles.input.MoveViewportInputMode]
   * @see [verticalScrollBarPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23horizontalScrollBarPolicy">Online Documentation</a>
   */
  open var horizontalScrollBarPolicy: ScrollBarVisibility
  
  /**
   * Gets or sets an event recognizer that determines whether the mouse wheel should [scroll][CanvasComponent] in horizontal instead of vertical direction.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23horizontalScrollEventRecognizer">Online Documentation</a>
   */
  final var horizontalScrollEventRecognizer: EventRecognizer
  
  /**
   * Gets the `HTMLElement` that represents this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23htmlElement">Online Documentation</a>
   */
  final val htmlElement: HTMLElement
  
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
   * Gets or sets the [IInputModeContext] instance that is used by the [inputMode][CanvasComponent] instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23inputModeContext">Online Documentation</a>
   */
  final var inputModeContext: IInputModeContext
  
  /**
   * Gets the last location provided by a pointing device (for instance mouse or touch).
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23lastEventLocation">Online Documentation</a>
   */
  final val lastEventLocation: Point
  
  /**
   * Gets the last [pointer event][PointerEventArgs] triggered by this instance.
   * @see [pointer-click]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23lastInputEvent">Online Documentation</a>
   */
  final val lastInputEvent: PointerEventArgs
  
  /**
   * Gets or sets a value indicating whether the maximum zoom level for [fitContent][CanvasComponent] and [FIT_CONTENT][Command] is limited to 1.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23limitFitContentZoom">Online Documentation</a>
   */
  final var limitFitContentZoom: Boolean
  
  /**
   * Gets or sets the duration a pointing device must be held down without moving before the [pointer-long-press][CanvasComponent] event is raised.
   * @see [pointer-long-press]
   * @see [longRestTime]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23longPressTime">Online Documentation</a>
   */
  final var longPressTime: TimeSpan
  
  /**
   * Gets or sets the duration a pointing device must not move before the [pointer-long-rest][CanvasComponent] event is raised.
   * @see [pointer-long-rest]
   * @see [longPressTime]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23longRestTime">Online Documentation</a>
   */
  final var longRestTime: TimeSpan
  
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
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23mouseWheelScrollFactor">Online Documentation</a>
   */
  final var mouseWheelScrollFactor: Double
  
  /**
   * Gets or sets an event recognizer that determines whether turning the mouse wheel should perform [zooming][CanvasComponent] instead of [scrolling][CanvasComponent].
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
   * Gets the render tree for the canvas that holds all [IRenderTreeElement]s that will be rendered by this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23renderTree">Online Documentation</a>
   */
  final val renderTree: RenderTree
  
  /**
   * Gets a value indicating whether the UI is right to left.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23rightToLeft">Online Documentation</a>
   */
  final val rightToLeft: Boolean
  
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
   * Gets the control's [svgDefsManager][CanvasComponent]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23svgDefsManager">Online Documentation</a>
   */
  final val svgDefsManager: SvgDefsManager
  
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
   * Gets or sets the current viewpoint.
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
   * @see [zoom-changed]
   * @see [minimumZoom]
   * @see [maximumZoom]
   * @see [zoomTo]
   * @see [zoomToAnimated]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23zoom">Online Documentation</a>
   */
  final var zoom: Double
  
  /**
   * Adds a generic callback as a chain link to the lookup.
   * @param [genericLink] The generic callback to add to the lookup chain.
   * @return An [IContextLookupChainLink] that has been [added][ILookupDecorator] to the lookup.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-addGenericInputModeContextLookup">Online Documentation</a>
   */
  fun addGenericInputModeContextLookup(
    genericLink: Func4<IInputModeContext, IClassMetadata<*>, IContextLookup<*>, Any>,
  ): IContextLookupChainLink<*>
  
  /**
   * Returns whether the given `command` can be executed with the given optional `parameter`.
   * @param [command] The command to execute.
   * @param [parameter] An optional parameter to provide for the command.
   * @return Returns `true` if the command can be executed, otherwise `false`.
   * @see [Command]
   * @see [KeyboardInputMode.addCommandBinding][yfiles.input.KeyboardInputMode.addCommandBinding]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-canExecuteCommand">Online Documentation</a>
   */
  fun canExecuteCommand(
    command: Command,
    parameter: Any?  = definedExternally,
  ): Boolean
  
  /**
   * Cleans up by removing any connection from the [htmlElement][CanvasComponent] element to the [CanvasComponent] instance and any associated element that was created during the lifetime of the component.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-cleanUp">Online Documentation</a>
   */
  open fun cleanUp()
  
  /**
   * Helper method that ensures that the viewport limit as returned by the [viewportLimiter][CanvasComponent] is obeyed.
   * @param [mode] The mode defining how viewport limitations are applied. Defaults to [PROGRAMMATIC_NAVIGATION][ViewportLimitingMode].
   * @see [viewportLimiter]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-coerceViewportLimits">Online Documentation</a>
   */
  open fun coerceViewportLimits(
    mode: ViewportLimitingMode  = definedExternally,
  )
  
  /**
   * Creates an appropriate [IRenderContext] that can be used to [create visuals][IVisualCreator] using [IVisualCreator] implementations.
   * @return A new context instance that is bound to this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-createRenderContext">Online Documentation</a>
   */
  open fun createRenderContext(): IRenderContext
  
  /**
   * Ensures that the provided bounds in world coordinates are visible by adjusting the viewport accordingly.
   * @param [bounds] The bounds to make visible.
   * @param [viewportPadding] Padding in view coordinates to keep free around the content.
   * @param [mode] The mode the viewport limiter should use.
   * @return A [Promise] that completes when the viewport has been adjusted.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-ensureVisible(Rect,Insets,ViewportLimitingMode)">Online Documentation</a>
   */
  open fun ensureVisible(
    bounds: Rect,
    viewportPadding: Insets?  = definedExternally,
    mode: ViewportLimitingMode  = definedExternally,
  ): Promise<Void>
  
  /**
   * Ensures that the provided points in world coordinates are all visible by adjusting the viewport accordingly.
   * @param [points] The points to make visible.
   * @param [viewportPadding] Padding in view coordinates to keep free around the content.
   * @param [mode] The mode the viewport limiter should use.
   * @return A [Promise] that completes when the viewport has been adjusted.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-ensureVisible(IEnumerable,Insets,ViewportLimitingMode)">Online Documentation</a>
   */
  open fun ensureVisible(
    points: IEnumerable<Point>,
    viewportPadding: Insets?  = definedExternally,
    mode: ViewportLimitingMode  = definedExternally,
  ): Promise<Void>
  
  /**
   * Executes the given `command` with the given optional `parameter` on this [CanvasComponent].
   * @param [command] The command to execute.
   * @param [parameter] An optional parameter to provide for the command.
   * @see [Command]
   * @see [KeyboardInputMode.addCommandBinding][yfiles.input.KeyboardInputMode.addCommandBinding]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-executeCommand">Online Documentation</a>
   */
  fun executeCommand(
    command: Command,
    parameter: Any?  = definedExternally,
  )
  
  /**
   * Exports the graphical content for this [CanvasComponent].
   * @param [context] The context to use.
   * @return An SVG element that represents the contents of this control.
   * @see [SvgExport.createRenderContext]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-exportContent">Online Documentation</a>
   */
  open fun exportContent(
    context: IRenderContext,
  ): Element
  
  /**
   * Fires the size changed event.
   * @param [oldSize] The old size.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-fireSizeChanged">Online Documentation</a>
   */
  fun fireSizeChanged(
    oldSize: Size,
  )
  
  /**
   * Adjusts the viewport to fully encompass the [contentBounds][CanvasComponent].
   * @param [animated] Whether to change the viewport in an animated fashion.
   * @return A [Promise] that completes when the viewport has been adjusted.
   * @see [updateContentBounds]
   * @see [zoom]
   * @see [zoomTo]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-fitContent">Online Documentation</a>
   */
  open fun fitContent(
    animated: Boolean  = definedExternally,
  ): Promise<Void>
  
  /**
   * Focuses the [htmlElement][CanvasComponent] element that is backing this instance.
   * @param [options] The optional focus options.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-focus">Online Documentation</a>
   */
  fun focus(
    options: web.dom.FocusOptions?  = definedExternally,
  )
  
  /**
   * Gets the [LookupDecorator] that can be used to decorate the [lookup][ILookup] call in the [inputModeContext][CanvasComponent].
   * @return The [LookupDecorator] instance that can be used for decorating the lookup operation within the context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-getInputModeContextDecoratorFor">Online Documentation</a>
   */
  fun <TInterface> getInputModeContextDecoratorFor(
    interfaceType: IClassMetadata<TInterface>,
  ): LookupDecorator<IInputModeContext, TInterface>
  
  /**
   * Determines the animation duration for a viewport animation.
   * @param [newCenter] The new center of the viewport.
   * @param [newZoom] The new zoom factor.
   * @param [viewportChanges] The kind of viewport change that triggered this method. Even though [ViewportChanges] supports multiple values as bitwise flags, only one of them is ever passed here.
   * @return A [TimeSpan] indicating the desired animation duration.
   * @see [animatedViewportChanges]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-getViewportAnimationDuration">Online Documentation</a>
   */
  protected open fun getViewportAnimationDuration(
    newCenter: Point,
    newZoom: Double,
    viewportChanges: ViewportChanges,
  ): TimeSpan
  
  /**
   * Ensures that the [contentBounds][CanvasComponent] encompasses the given rectangle.
   * @param [rectangle] The rectangle that should be included in the content bounds
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-growContentBounds">Online Documentation</a>
   */
  fun growContentBounds(
    rectangle: Rect,
  )
  
  /**
   * Used by the default implementation of [inputModeContext][CanvasComponent] to resolve [lookup][ILookup] calls.
   * @param [context] The context.
   * @param [type] The Type to query
   * @return The result of the query.
   * @see [IInputModeContext]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-inputModeContextLookup">Online Documentation</a>
   */
  protected open fun inputModeContextLookup(
    context: IInputModeContext,
    type: IClassMetadata<*>,
  ): Any?
  
  /**
   * Converts intermediate coordinates to view coordinates expressed in the control's coordinate system.
   * @param [intermediatePoint] the coordinates in the view coordinate system
   * @return The coordinates in pixels relative to the control's upper left corner in the view coordinate system
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-intermediateToViewCoordinates">Online Documentation</a>
   */
  fun intermediateToViewCoordinates(
    intermediatePoint: Point,
  ): Point
  
  /**
   * Converts intermediate coordinates to world coordinates.
   * @param [intermediatePoint] Coordinates expressed in the intermediate coordinate system
   * @return The coordinates expressed in the world coordinate system.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-intermediateToWorldCoordinates">Online Documentation</a>
   */
  fun intermediateToWorldCoordinates(
    intermediatePoint: Point,
  ): Point
  
  /**
   * Invalidates this instance and marks it as in need for [an update][CanvasComponent].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-invalidate">Online Documentation</a>
   */
  fun invalidate()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-lookup">Online Documentation</a>
   */
  override fun <T : Any> lookup(
    type: IClassMetadata<T>,
  ): T?
  
  /**
   * Calls `event.preventDefault()` for each `contextMenu` event that occurs on this instance.
   * @param [event] The event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-maybePreventContextMenuDefault">Online Documentation</a>
   */
  protected open fun maybePreventContextMenuDefault(
    event: Event,
  )
  
  /**
   * Calls `event.preventDefault()` if [captureAllPointerInput][CanvasComponent] is enabled.
   * @param [event] The event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-maybePreventPointerDefault">Online Documentation</a>
   */
  protected open fun maybePreventPointerDefault(
    event: Event,
  )
  
  /**
   * This method will be called when the mouse wheel was turned and if the [mouseWheelBehavior][CanvasComponent] property is set to [SCROLL][MouseWheelBehaviors].
   * @param [event] The event describing the action
   * @see [mouseWheelBehavior]
   * @see [mouseWheelScrollFactor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-mouseWheelScroll">Online Documentation</a>
   */
  protected open fun mouseWheelScroll(
    event: PointerEventArgs,
  )
  
  /**
   * This method will be called when the mouse wheel was turned and if the [mouseWheelBehavior][CanvasComponent] property is set to [ZOOM][MouseWheelBehaviors].
   * @param [event] the event describing the action
   * @see [mouseWheelBehavior]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-mouseWheelZoom">Online Documentation</a>
   */
  protected open fun mouseWheelZoom(
    event: PointerEventArgs,
  )
  
  /**
   * Converts <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/CSSOM_View/Coordinate_systems">html page coordinates</a> to view coordinates.
   * @param [pageLocation] The html page coordinates to convert.
   * @return The view coordinates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-pageToViewCoordinates">Online Documentation</a>
   */
  fun pageToViewCoordinates(
    pageLocation: Point,
  ): Point
  
  /**
   * Converts <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/CSSOM_View/Coordinate_systems">html page coordinates</a> to world coordinates.
   * @param [pageLocation] The html page coordinates to convert.
   * @return The world coordinates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-pageToWorldCoordinates">Online Documentation</a>
   */
  fun pageToWorldCoordinates(
    pageLocation: Point,
  ): Point
  
  /**
   * Stops the mouse capture and returns to normal event capturing.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-stopMouseCapture">Online Documentation</a>
   */
  fun stopMouseCapture()
  
  /**
   * Updates the [contentBounds][CanvasComponent] to encompass the bounds of all elements in the current scene graph plus the given margins.
   * @param [margins] The additional margins to add to the calculated bounds.
   * @param [group] The scene graph group to traverse. If none is specified, the [contentGroup][RenderTree] is used.
   * @see [IBoundsProvider]
   * @see [contentBounds]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-updateContentBounds">Online Documentation</a>
   */
  open fun updateContentBounds(
    margins: Insets?  = definedExternally,
    group: IRenderTreeGroup  = definedExternally,
  )
  
  /**
   * Updates the visual tree that displays the contents of this control.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-updateVisual">Online Documentation</a>
   */
  open fun updateVisual()
  
  /**
   * Invalidates this instance and marks it as in need for [an update][CanvasComponent].
   * @return A Promise that will resolve once the component has been [updated][CanvasComponent]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-updateVisualAsync">Online Documentation</a>
   */
  fun updateVisualAsync(): Promise<Void>
  
  /**
   * Converts view coordinates to intermediate coordinates, effectively canceling any [projection][CanvasComponent] if set.
   * @param [viewPoint] the coordinates in the view coordinate system
   * @return The coordinates in pixels relative to the control's upper left corner in the intermediate coordinate system
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-viewToIntermediateCoordinates">Online Documentation</a>
   */
  fun viewToIntermediateCoordinates(
    viewPoint: Point,
  ): Point
  
  /**
   * Converts view coordinates to the <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/CSSOM_View/Coordinate_systems">html page coordinates</a>.
   * @param [viewLocation] The view coordinates to convert.
   * @return The coordinates in the html document's coordinate system.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-viewToPageCoordinates">Online Documentation</a>
   */
  fun viewToPageCoordinates(
    viewLocation: Point,
  ): Point
  
  /**
   * Converts coordinates expressed in the component's coordinate system to world coordinates.
   * @param [viewPoint] the coordinates in pixels relative to the component's upper left corner
   * @return The coordinates expressed in the world coordinate system
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-viewToWorldCoordinates">Online Documentation</a>
   */
  fun viewToWorldCoordinates(
    viewPoint: Point,
  ): Point
  
  /**
   * Converts world coordinates to the component's coordinate system before the [projection][CanvasComponent] is applied.
   * @param [worldPoint] the coordinates in the world coordinate system
   * @return Coordinates expressed in pixels relative to the control's upper left corner in the intermediate coordinate system
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-worldToIntermediateCoordinates">Online Documentation</a>
   */
  fun worldToIntermediateCoordinates(
    worldPoint: Point,
  ): Point
  
  /**
   * Converts world coordinates to view coordinates expressed in the control's coordinate system.
   * @param [worldPoint] Coordinates in the world coordinate system
   * @return The coordinates in pixels relative to the control's upper left corner
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-worldToViewCoordinates">Online Documentation</a>
   */
  fun worldToViewCoordinates(
    worldPoint: Point,
  ): Point
  
  /**
   * Sets the zoom level and viewport center so that the given rectangle in world coordinates fits the viewport.
   * @param [bounds] The coordinates of the rectangle to zoom to.
   * @see [zoomTo]
   * @see [zoomToAnimated]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-zoomTo(Rect)">Online Documentation</a>
   */
  open fun zoomTo(
    bounds: Rect,
  )
  
  /**
   * Sets the zoom level and viewport [center][CanvasComponent] to the given values.
   * @param [zoom] The new zoom level.
   * @param [center] The optional new center of the viewport in world coordinates. If not specified, this implementation zooms to the current viewport center.
   * @see [zoomTo]
   * @see [zoomToAnimated]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-zoomTo(number,Point)">Online Documentation</a>
   */
  open fun zoomTo(
    zoom: Double,
    center: Point  = definedExternally,
  )
  
  /**
   * Transitions the viewport in an animated fashion to a new zoom level and center so that the given rectangle in world coordinates fits the viewport.
   * @param [bounds] The coordinates of the rectangle to zoom to.
   * @return A Promise that resolves when the viewport has been adjusted.
   * @see [zoomTo]
   * @see [zoomToAnimated]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-zoomToAnimated(Rect)">Online Documentation</a>
   */
  open fun zoomToAnimated(
    bounds: Rect,
  ): Promise<Void>
  
  /**
   * Transitions to a new zoom level and viewport center in an animated fashion.
   * @param [zoom] The new zoom level.
   * @param [center] The optional new center of the viewport in world coordinates. If not specified, this implementation zooms to the current viewport center.
   * @return A Promise that resolves once the animation is finished.
   * @see [zoomToAnimated]
   * @see [zoomTo]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-zoomToAnimated(number,Point)">Online Documentation</a>
   */
  open fun zoomToAnimated(
    zoom: Double,
    center: Point  = definedExternally,
  ): Promise<Void>
  
  companion object : ClassMetadata<CanvasComponent> {
    /**
     * Gets the [CanvasComponent] instance that is associated with the given element, or null.
     * @receiver The element to get the [CanvasComponent] for.
     * @return The [CanvasComponent] instance that is associated with the given element, or `null`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23CanvasComponent-method-getComponent">Online Documentation</a>
     */
    fun Element?.getComponent(): CanvasComponent?
  }
}

/**
 * `content-bounds-changed`: Occurs when the [contentBounds][CanvasComponent] have been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23content-bounds-changed">Online Documentation</a>
 */
inline fun  CanvasComponent.addContentBoundsChangedHandler(
  crossinline handler: () -> Unit
): () -> Unit {
  val listener: EventHandler = { _, _ -> handler() }
  addEventListener("content-bounds-changed", listener)
  return { removeEventListener("content-bounds-changed", listener) }
}

/**
 * `pointer-leave`: Occurs when the mouse has exited the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23pointer-leave">Online Documentation</a>
 */
inline fun  CanvasComponent.addPointerLeaveHandler(
  crossinline handler: (event:PointerEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<PointerEventArgs> = { event, _ -> handler(event) }
  addEventListener("pointer-leave", listener)
  return { removeEventListener("pointer-leave", listener) }
}

/**
 * `pointer-enter`: Occurs when the mouse has entered the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23pointer-enter">Online Documentation</a>
 */
inline fun  CanvasComponent.addPointerEnterHandler(
  crossinline handler: (event:PointerEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<PointerEventArgs> = { event, _ -> handler(event) }
  addEventListener("pointer-enter", listener)
  return { removeEventListener("pointer-enter", listener) }
}

/**
 * `pointer-move`: Occurs when the mouse has been moved in world coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23pointer-move">Online Documentation</a>
 */
inline fun  CanvasComponent.addPointerMoveHandler(
  crossinline handler: (event:PointerEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<PointerEventArgs> = { event, _ -> handler(event) }
  addEventListener("pointer-move", listener)
  return { removeEventListener("pointer-move", listener) }
}

/**
 * `pointer-down`: Occurs when a mouse button has been pressed, i.e., on `mousedown`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23pointer-down">Online Documentation</a>
 */
inline fun  CanvasComponent.addPointerDownHandler(
  crossinline handler: (event:PointerEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<PointerEventArgs> = { event, _ -> handler(event) }
  addEventListener("pointer-down", listener)
  return { removeEventListener("pointer-down", listener) }
}

/**
 * `pointer-drag`: Occurs when the mouse is being moved while at least one of the mouse buttons is pressed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23pointer-drag">Online Documentation</a>
 */
inline fun  CanvasComponent.addPointerDragHandler(
  crossinline handler: (event:PointerEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<PointerEventArgs> = { event, _ -> handler(event) }
  addEventListener("pointer-drag", listener)
  return { removeEventListener("pointer-drag", listener) }
}

/**
 * `pointer-up`: Occurs when the mouse button has been released, i.e., on `mouseup`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23pointer-up">Online Documentation</a>
 */
inline fun  CanvasComponent.addPointerUpHandler(
  crossinline handler: (event:PointerEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<PointerEventArgs> = { event, _ -> handler(event) }
  addEventListener("pointer-up", listener)
  return { removeEventListener("pointer-up", listener) }
}

/**
 * `lost-pointer-capture`: Occurs when the mouse capture has been lost.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23lost-pointer-capture">Online Documentation</a>
 */
inline fun  CanvasComponent.addLostPointerCaptureHandler(
  crossinline handler: (event:PointerEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<PointerEventArgs> = { event, _ -> handler(event) }
  addEventListener("lost-pointer-capture", listener)
  return { removeEventListener("lost-pointer-capture", listener) }
}

/**
 * `pointer-cancel`: Occurs when the mouse capture has been lost.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23pointer-cancel">Online Documentation</a>
 */
inline fun  CanvasComponent.addPointerCancelHandler(
  crossinline handler: (event:PointerEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<PointerEventArgs> = { event, _ -> handler(event) }
  addEventListener("pointer-cancel", listener)
  return { removeEventListener("pointer-cancel", listener) }
}

/**
 * `wheel`: Occurs when the mouse wheel has turned.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23wheel">Online Documentation</a>
 */
inline fun  CanvasComponent.addWheelHandler(
  crossinline handler: (event:PointerEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<PointerEventArgs> = { event, _ -> handler(event) }
  addEventListener("wheel", listener)
  return { removeEventListener("wheel", listener) }
}

/**
 * `pointer-click`: Occurs when the user [clicks][PointerEventType] the pointer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23pointer-click">Online Documentation</a>
 */
inline fun  CanvasComponent.addPointerClickHandler(
  crossinline handler: (event:PointerEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<PointerEventArgs> = { event, _ -> handler(event) }
  addEventListener("pointer-click", listener)
  return { removeEventListener("pointer-click", listener) }
}

/**
 * `key-down`: Occurs when keys are being pressed, i.e., on `keydown`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23key-down">Online Documentation</a>
 */
inline fun  CanvasComponent.addKeyDownHandler(
  crossinline handler: (event:KeyEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<KeyEventArgs> = { event, _ -> handler(event) }
  addEventListener("key-down", listener)
  return { removeEventListener("key-down", listener) }
}

/**
 * `key-up`: Occurs when keys are being released, i.e., on `keyup`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23key-up">Online Documentation</a>
 */
inline fun  CanvasComponent.addKeyUpHandler(
  crossinline handler: (event:KeyEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<KeyEventArgs> = { event, _ -> handler(event) }
  addEventListener("key-up", listener)
  return { removeEventListener("key-up", listener) }
}

/**
 * `viewport-changed`: Occurs when the [viewport][CanvasComponent] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23viewport-changed">Online Documentation</a>
 */
inline fun  CanvasComponent.addViewportChangedHandler(
  crossinline handler: (propertyName:String) -> Unit
): () -> Unit {
  val listener: EventHandler1<PropertyChangedEventArgs> = { event, _ -> handler(event.propertyName) }
  addEventListener("viewport-changed", listener)
  return { removeEventListener("viewport-changed", listener) }
}

/**
 * `pointer-long-press`: Occurs when the user performed a long press gesture with a pointer device.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23pointer-long-press">Online Documentation</a>
 */
inline fun  CanvasComponent.addPointerLongPressHandler(
  crossinline handler: (event:PointerEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<PointerEventArgs> = { event, _ -> handler(event) }
  addEventListener("pointer-long-press", listener)
  return { removeEventListener("pointer-long-press", listener) }
}

/**
 * `pointer-long-rest`: Occurs during a [DRAG][PointerEventType] or [MOVE][PointerEventType], when the pointer only moves a lit bit during the amount of time specified in [longRestTime][CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23pointer-long-rest">Online Documentation</a>
 */
inline fun  CanvasComponent.addPointerLongRestHandler(
  crossinline handler: (event:PointerEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<PointerEventArgs> = { event, _ -> handler(event) }
  addEventListener("pointer-long-rest", listener)
  return { removeEventListener("pointer-long-rest", listener) }
}

/**
 * `zoom-changed`: Occurs when the value of the [zoom][CanvasComponent] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23zoom-changed">Online Documentation</a>
 */
inline fun  CanvasComponent.addZoomChangedHandler(
  crossinline handler: () -> Unit
): () -> Unit {
  val listener: EventHandler = { _, _ -> handler() }
  addEventListener("zoom-changed", listener)
  return { removeEventListener("zoom-changed", listener) }
}

/**
 * `updated-visual`: Occurs after the [visual tree has been updated][CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23updated-visual">Online Documentation</a>
 */
inline fun  CanvasComponent.addUpdatedVisualHandler(
  crossinline handler: () -> Unit
): () -> Unit {
  val listener: EventHandler = { _, _ -> handler() }
  addEventListener("updated-visual", listener)
  return { removeEventListener("updated-visual", listener) }
}

/**
 * `updating-visual`: Occurs before the [visual tree is updated][CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23updating-visual">Online Documentation</a>
 */
inline fun  CanvasComponent.addUpdatingVisualHandler(
  crossinline handler: () -> Unit
): () -> Unit {
  val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
  addEventListener("updating-visual", listener)
  return { removeEventListener("updating-visual", listener) }
}

/**
 * `prepare-render-context`: Occurs before the visual tree is painted to prepare the [IRenderContext].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23prepare-render-context">Online Documentation</a>
 */
inline fun  CanvasComponent.addPrepareRenderContextHandler(
  crossinline handler: (event:PrepareRenderContextEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<PrepareRenderContextEventArgs> = { event, _ -> handler(event) }
  addEventListener("prepare-render-context", listener)
  return { removeEventListener("prepare-render-context", listener) }
}

/**
 * `can-execute-changed`: Occurs when the [executability state][CanvasComponent] of a command might have changed.
 * @see [Command]
 * @see [KeyboardInputMode.addAddCommandBindingHandler][yfiles.input.KeyboardInputMode.addAddCommandBindingHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23can-execute-changed">Online Documentation</a>
 */
inline fun  CanvasComponent.addCanExecuteChangedHandler(
  crossinline handler: () -> Unit
): () -> Unit {
  val listener: EventHandler = { _, _ -> handler() }
  addEventListener("can-execute-changed", listener)
  return { removeEventListener("can-execute-changed", listener) }
}

/**
 * `size-changed`: Occurs when the size of this component is changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CanvasComponent%23size-changed">Online Documentation</a>
 */
inline fun  CanvasComponent.addSizeChangedHandler(
  crossinline handler: (event:SizeChangedEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<SizeChangedEventArgs> = { event, _ -> handler(event) }
  addEventListener("size-changed", listener)
  return { removeEventListener("size-changed", listener) }
}
