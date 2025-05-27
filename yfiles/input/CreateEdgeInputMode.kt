// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import js.promise.Promise
import js.promise.PromiseResult
import yfiles.collections.IEnumerable
import yfiles.geometry.IPoint
import yfiles.geometry.Point
import yfiles.graph.IBend
import yfiles.graph.IEdge
import yfiles.graph.IEdgeDefaults
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.graph.IPortOwner
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.TimeSpan
import yfiles.view.Cursor
import yfiles.view.IObjectRenderer
import yfiles.view.PortCandidateRenderTag

/**
 * An [IInputMode] for interactively creating edges between nodes and edges in an [IGraph] displayed in a [CanvasComponent][yfiles.view.CanvasComponent] or [GraphComponent][yfiles.view.GraphComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance that will use the [IGraph] from the [parentInputModeContext][CreateEdgeInputMode] to create edges in.
 * @see [graph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-constructor-CreateEdgeInputMode">Online Documentation</a>
 */
open external class CreateEdgeInputMode () : IInputMode, IEventDispatcher {
  /**
   * Gets or sets whether to allow the creation of bends.
   * 
   * The default is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23allowCreateBend">Online Documentation</a>
   */
  final var allowCreateBend: Boolean
  
  /**
   * Gets or sets whether or not edges are allowed to connect to other edges.
   * 
   * The default is `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23allowEdgeToEdgeConnections">Online Documentation</a>
   */
  final var allowEdgeToEdgeConnections: Boolean
  
  /**
   * Gets or sets whether or not to allow the creation of self-loops.
   * 
   * The default is `true`, which enables that an edge is connected to a [sourcePort][IEdge] and [targetPort][IEdge] that have the same [owner][IPort].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23allowSelfLoops">Online Documentation</a>
   */
  final var allowSelfLoops: Boolean
  
  /**
   * Gets or sets a [IHitTestable] that determines whether it is valid to start an edge creation gesture here.
   * 
   * The default implementation returns `true` if the cursor is located over a port owner.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23beginHitTestable">Online Documentation</a>
   */
  final var beginHitTestable: IHitTestable
  
  /**
   * Gets or sets the event recognizer that recognizes the start gesture that is used to prepare the edge creation on the start node or edge.
   * 
   * The default recognizer detects primary down events for [MOUSE][yfiles.view.PointerType] or [PEN][yfiles.view.PointerType].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23beginRecognizer">Online Documentation</a>
   */
  final var beginRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that recognizes the touch gesture that is used to prepare the edge creation on the start node.
   * 
   * The default is [TOUCH_PRIMARY_LONG_PRESS][EventRecognizers]. If [showPortCandidates][CreateEdgeInputMode] includes [START][ShowPortCandidates], this will also show the port candidates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23beginRecognizerTouch">Online Documentation</a>
   */
  final var beginRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets a value that specifies whether moving the input focus away from the [canvasComponent][yfiles.view.ICanvasContext] cancels edge creation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23cancelCreationOnFocusLost">Online Documentation</a>
   */
  final var cancelCreationOnFocusLost: Boolean
  
  /**
   * Gets or sets whether after calls to [createEdge][CreateEdgeInputMode] the current undo edit should be canceled if the method returns `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23cancelEditImplicitly">Online Documentation</a>
   */
  final var cancelEditImplicitly: Boolean
  
  /**
   * Gets or sets whether an edge creation gesture will be canceled when the gesture is ended on an invalid end point and no bend may be created there.
   * @see [allowCreateBend]
   * @see [validBendHitTestable]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23cancelGestureOnInvalidEnd">Online Documentation</a>
   */
  final var cancelGestureOnInvalidEnd: Boolean
  
  /**
   * Gets or sets the event recognizer that determines whether to cancel edge creation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23cancelRecognizer">Online Documentation</a>
   */
  final var cancelRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to cancel edge creation via touch.
   * 
   * The default recognizer detects secondary double tap events.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23cancelRecognizerTouch">Online Documentation</a>
   */
  final var cancelRecognizerTouch: EventRecognizer
  
  /**
   * Gets the installed [controller][CreateEdgeInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23controller">Online Documentation</a>
   */
  protected final val controller: ConcurrencyController?
  
  /**
   * Gets or sets the event recognizer that determines whether to create a bend.
   * 
   * The default recognizer detects primary [DOWN][yfiles.view.PointerEventType] events for [MOUSE][yfiles.view.PointerType] or [PEN][yfiles.view.PointerType].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23createBendRecognizer">Online Documentation</a>
   */
  final var createBendRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to create a bend via touch.
   * 
   * The default is [TOUCH_PRIMARY_UP][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23createBendRecognizerTouch">Online Documentation</a>
   */
  final var createBendRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that constrains the current edge segment to be orthogonal or diagonal.
   * 
   * The default recognizer is [SHIFT_IS_DOWN][EventRecognizers]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23directionalConstraintRecognizer">Online Documentation</a>
   */
  final var directionalConstraintRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that temporarily disables snapping.
   * 
   * The default recognizer is [ALT_DOWN][EventRecognizers]
   * @see [enableSnappingRecognizer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23disableSnappingRecognizer">Online Documentation</a>
   */
  final var disableSnappingRecognizer: EventRecognizer
  
  /**
   * Gets or sets the cursor that is used while a new edge is created when there is no [valid location][CreateEdgeInputMode] to create a bend.
   * 
   * The default cursor is [DEFAULT][Cursor].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23dragCursor">Online Documentation</a>
   */
  final var dragCursor: Cursor?
  
  /**
   * Gets the dynamically updated dragging point for the edge creation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23dragPoint">Online Documentation</a>
   */
  final val dragPoint: IPoint
  
  /**
   * Gets or sets the ports-based edge creation callback.
   * @throws ArgumentError If the argument is `null`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23edgeCreator">Online Documentation</a>
   */
  final var edgeCreator: EdgeCreationCallback
  
  /**
   * Gets or sets the appearance of newly created edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23edgeDefaults">Online Documentation</a>
   */
  final var edgeDefaults: IEdgeDefaults
  
  /**
   * Gets or sets a value that determines how the direction of a newly created edge is determined.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23edgeDirectionPolicy">Online Documentation</a>
   */
  final var edgeDirectionPolicy: EdgeDirectionPolicy
  
  /**
   * Gets or sets the event recognizer that re-enables temporarily disabled snapping.
   * 
   * The default recognizer is [ALT_UP][EventRecognizers]
   * @see [disableSnappingRecognizer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23enableSnappingRecognizer">Online Documentation</a>
   */
  final var enableSnappingRecognizer: EventRecognizer
  
  /**
   * Gets or sets the enabled state of this input mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23enabled">Online Documentation</a>
   */
  open var enabled: Boolean
  
  /**
   * Gets or sets a [IHitTestable] that determines whether it is valid to finish an edge creation gesture here if valid [IPortCandidate]s are available.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23endHitTestable">Online Documentation</a>
   */
  final var endHitTestable: IHitTestable
  
  /**
   * Gets or sets the event recognizer that recognizes the movement of the end point of the edge.
   * 
   * The default recognizer detects [DRAG][yfiles.view.PointerEventType] events for [MOUSE][yfiles.view.PointerType] and [PEN][yfiles.view.PointerType].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23endPointMoveRecognizer">Online Documentation</a>
   */
  final var endPointMoveRecognizer: EventRecognizer
  
  /**
   * Gets or sets the current candidate for the end point of the dragged edge to be created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23endPortCandidate">Online Documentation</a>
   */
  final var endPortCandidate: IPortCandidate?
  
  /**
   * Gets or sets the event recognizer that will be queried to decide if bend creation is enforced.
   * 
   * The default is [ALT_IS_DOWN][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23enforceBendCreationRecognizer">Online Documentation</a>
   */
  final var enforceBendCreationRecognizer: EventRecognizer
  
  /**
   * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23exclusive">Online Documentation</a>
   */
  final var exclusive: Boolean
  
  /**
   * Gets or sets the event recognizer that recognizes the finishing gesture that is used to end the edge creation on the end node.
   * 
   * The default recognizer detects primary up or down events for [MOUSE][yfiles.view.PointerType] or [PEN][yfiles.view.PointerType].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23finishRecognizer">Online Documentation</a>
   */
  final var finishRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that recognizes the touch gesture that is used to end the edge creation on the end node.
   * 
   * The default is [TOUCH_PRIMARY_UP][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23finishRecognizerTouch">Online Documentation</a>
   */
  final var finishRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets a property that determines whether the mouse should be forced to snap to the nearest valid port candidate if the mouse hovers over an end node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23forceSnapToCandidate">Online Documentation</a>
   */
  final var forceSnapToCandidate: Boolean
  
  /**
   * Gets the graph this mode is acting upon.
   * @throws NotSupportedError If there is no input mode context available or the context does not contain the graph in the lookup.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23graph">Online Documentation</a>
   */
  final val graph: IGraph
  
  /**
   * Gets whether currently an edge creation is in progress.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23isCreationInProgress">Online Documentation</a>
   */
  open val isCreationInProgress: Boolean
  
  /**
   * Gets or sets the minimum number of bends to create before a self-loop is created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23minimumSelfLoopBendCount">Online Documentation</a>
   */
  final var minimumSelfLoopBendCount: Int
  
  /**
   * Gets or sets the event recognizer that recognizes the initial gesture that is used to initiate the creation after the preparation.
   * 
   * The default recognizer is [MOUSE_DRAG][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23moveRecognizer">Online Documentation</a>
   */
  final var moveRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that recognizes the touch gesture that is used to initiate the edge creation after the preparation.
   * 
   * The default is [TOUCH_PRIMARY_DRAG][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23moveRecognizerTouch">Online Documentation</a>
   */
  final var moveRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets the width of a node's border which is taken into account when deciding which way to route the first segment of an orthogonal edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23nodeBorderWidthRatio">Online Documentation</a>
   */
  final var nodeBorderWidthRatio: Double
  
  /**
   * Gets or sets the policy that controls whether edges will be created orthogonally.
   * @see [GraphEditorInputMode.orthogonalEdgeEditingContext]
   * @see [OrthogonalEdgeEditingContext.isOrthogonallyEditedEdge]
   * @see [OrthogonalEdgeEditingContext.enabled]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23orthogonalEdgeCreation">Online Documentation</a>
   */
  final var orthogonalEdgeCreation: OrthogonalEdgeEditingPolicy
  
  /**
   * Gets or sets the distance in the view coordinate system that determines how far the mouse should be snapped to a horizontal or vertical line.
   * 
   * The default value is `5`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23orthogonalSnapDistance">Online Documentation</a>
   */
  final var orthogonalSnapDistance: Double
  
  /**
   * Retrieves the [IInputModeContext] this mode has been installed in.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23parentInputModeContext">Online Documentation</a>
   */
  protected final val parentInputModeContext: IInputModeContext?
  
  /**
   * Gets or sets the [IObjectRenderer] that visualizes [IPortCandidate]s while creating edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23portCandidateRenderer">Online Documentation</a>
   */
  final var portCandidateRenderer: IObjectRenderer<PortCandidateRenderTag>
  
  /**
   * Gets or sets the event recognizer that determines whether dynamic port candidates should be resolved.
   * 
   * The default detects the current platform and delegates either to [META_IS_DOWN][EventRecognizers] (macOS) or [CTRL_IS_DOWN][EventRecognizers] (other platforms).
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23portCandidateResolutionRecognizer">Online Documentation</a>
   */
  final var portCandidateResolutionRecognizer: EventRecognizer
  
  /**
   * Gets or sets the preferred minimal distance of orthogonal edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23preferredMinimalEdgeDistance">Online Documentation</a>
   */
  final var preferredMinimalEdgeDistance: Double
  
  /**
   * Gets or sets a [IHitTestable] that determines whether it is valid to finish an edge creation gesture here even if no [IPortCandidate]s are available.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23prematureEndHitTestable">Online Documentation</a>
   */
  final var prematureEndHitTestable: IHitTestable
  
  /**
   * Gets the preview edge instance that will be used to render a preview of the edge to be created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23previewEdge">Online Documentation</a>
   */
  final val previewEdge: IEdge
  
  /**
   * The [INode] which is used as a moving end node for the temporarily created [previewEdge][CreateEdgeInputMode] during edge creation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23previewEndNode">Online Documentation</a>
   */
  final val previewEndNode: INode
  
  /**
   * The [IPort] which is used as the end port for the temporarily created [previewEdge][CreateEdgeInputMode] during edge creation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23previewEndNodePort">Online Documentation</a>
   */
  final val previewEndNodePort: IPort
  
  /**
   * Gets the preview graph instance that will hold the items that will render a preview of the newly created edge.
   * @see [previewEdge]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23previewGraph">Online Documentation</a>
   */
  final val previewGraph: IGraph
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23priority">Online Documentation</a>
   */
  final override var priority: Int
  
  /**
   * Gets or sets the event recognizer that determines whether to remove the last created bend.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23removeBendRecognizer">Online Documentation</a>
   */
  final var removeBendRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to remove the last created bend via touch.
   * 
   * The default recognizer detects secondary long press events.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23removeBendRecognizerTouch">Online Documentation</a>
   */
  final var removeBendRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets a value indicating whether [DYNAMIC][PortCandidateValidity] ports that are part of the [end port candidates][CreateEdgeInputMode] should be resolved for the current pointer location.
   * @see [portCandidateResolutionRecognizer]
   * @see [resolveCandidates]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23resolveEndPortCandidates">Online Documentation</a>
   */
  final var resolveEndPortCandidates: Boolean
  
  /**
   * Gets or sets a value indicating whether [DYNAMIC][PortCandidateValidity] ports that are part of the [start port candidates][CreateEdgeInputMode] should be resolved for the current mouse location.
   * @see [portCandidateResolutionRecognizer]
   * @see [resolveCandidates]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23resolveStartPortCandidates">Online Documentation</a>
   */
  final var resolveStartPortCandidates: Boolean
  
  /**
   * Gets or sets a value indicating whether the current edge creation should be created from its [targetPort][IEdge] to its [sourcePort][IEdge].
   * @see [edgeDirectionPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23reversedEdgeCreation">Online Documentation</a>
   */
  final var reversedEdgeCreation: Boolean
  
  /**
   * Gets or sets whether the owner of the current [endPortCandidate][CreateEdgeInputMode] should be highlighted.
   * 
   * The default is `true`.
   * @see [updateEndHighlight]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23showEndHighlight">Online Documentation</a>
   */
  final var showEndHighlight: Boolean
  
  /**
   * Gets or sets whether and where to display possible port candidates during the creation of the edge.
   * @see [startPortCandidateHitRadius]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23showPortCandidates">Online Documentation</a>
   */
  final var showPortCandidates: ShowPortCandidates
  
  /**
   * Gets or sets the amount of time to wait until the [start port candidates][ShowPortCandidates] are displayed, when the user hovers over a [start port candidate owner][CreateEdgeInputMode].
   * @see [showPortCandidates]
   * @see [startOverCandidateOnly]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23showStartPortCandidateDelay">Online Documentation</a>
   */
  final var showStartPortCandidateDelay: TimeSpan
  
  /**
   * Gets or sets a [IHitTestable] that determines whether to show start port candidates if the cursor hovers over the provided location.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23showStartPortCandidatesHitTestable">Online Documentation</a>
   */
  final var showStartPortCandidatesHitTestable: IHitTestable
  
  /**
   * Gets or sets the [GraphSnapContext] which manages snapping model items to certain coordinates (for instance, other items).
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23snapContext">Online Documentation</a>
   */
  final var snapContext: GraphSnapContext?
  
  /**
   * Gets or sets the distance in the view coordinate system that determines how far the mouse should be snapped to a port candidate if [snapToEndCandidate][CreateEdgeInputMode] is enabled.
   * 
   * The default value is `20`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23snapDistance">Online Documentation</a>
   */
  final var snapDistance: Double
  
  /**
   * Gets or sets whether or not the edge's end point should snap to the current end port candidate during the creation of the edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23snapToEndCandidate">Online Documentation</a>
   */
  final var snapToEndCandidate: Boolean
  
  /**
   * Gets or sets whether edge creation should only start if the pointer is located directly over a valid port candidate.
   * @see [startPortCandidateHitRadius]
   * @see [showPortCandidates]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23startOverCandidateOnly">Online Documentation</a>
   */
  final var startOverCandidateOnly: Boolean
  
  /**
   * Gets a copy of the start point at which the edge creation gesture started.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23startPoint">Online Documentation</a>
   */
  final val startPoint: Point
  
  /**
   * Gets or sets the candidate for the [sourcePort][IEdge] of the edge to be created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23startPortCandidate">Online Documentation</a>
   */
  final var startPortCandidate: IPortCandidate?
  
  /**
   * Gets or sets the radius from within a valid port candidate will be considered as hit.
   * @see [startOverCandidateOnly]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23startPortCandidateHitRadius">Online Documentation</a>
   */
  final var startPortCandidateHitRadius: Double
  
  /**
   * Gets or sets the cursor that is used once edge creation has started but the mouse is still over the new edge's start node.
   * 
   * The default cursor is [DEFAULT][Cursor].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23startPortOwnerDraggingCursor">Online Documentation</a>
   */
  final var startPortOwnerDraggingCursor: Cursor?
  
  /**
   * Gets or sets the event recognizer that starts the actual edge creation while dragging.
   * 
   * The default implementation starts edge creation after the mouse pointer has left the start port owner node for the first time.
   * @see [edge-creation-started]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23startPortOwnerDraggingFinishedRecognizer">Online Documentation</a>
   */
  final var startPortOwnerDraggingFinishedRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that recognizes gestures which toggle the [direction][CreateEdgeInputMode] of the created edge.
   * 
   * The default instance never triggers. When setting this recognizer, depending on the context of the application, this could result in an edge connecting to the wrong ports, so consider updating the ports by handling the [edge-direction-reversed][CreateEdgeInputMode] event, if ports have special semantics.
   * @see [edgeDirectionPolicy]
   * @see [onReversedEdgeCreationChanged]
   * @see [reversedEdgeCreation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23toggleDirectionRecognizer">Online Documentation</a>
   */
  final var toggleDirectionRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that toggles the orientation of the first orthogonal segment.
   * @see [orthogonalEdgeCreation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23toggleSegmentOrientationRecognizer">Online Documentation</a>
   */
  final var toggleSegmentOrientationRecognizer: EventRecognizer
  
  /**
   * Gets or sets whether this mode should use the [end port candidates][CreateEdgeInputMode] of the node the pointer currently hovers over, only.
   * 
   * The default is `true`.
   * @see [showPortCandidates]
   * @see [getEndPortOwner]
   * @see [getEndPortCandidates]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23useHitItemsCandidatesOnly">Online Documentation</a>
   */
  final var useHitItemsCandidatesOnly: Boolean
  
  /**
   * Gets or sets the cursor that indicates a valid place to begin an edge creation.
   * 
   * The default cursor is [POINTER][Cursor].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23validBeginCursor">Online Documentation</a>
   */
  final var validBeginCursor: Cursor?
  
  /**
   * Gets or sets the cursor that indicates a valid place to create a bend.
   * 
   * The default cursor is [DEFAULT][Cursor].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23validBendCursor">Online Documentation</a>
   */
  final var validBendCursor: Cursor?
  
  /**
   * Gets or sets a [IHitTestable] that determines whether it is valid to create a bend here.
   * 
   * The default implementation always returns `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23validBendHitTestable">Online Documentation</a>
   */
  final var validBendHitTestable: IHitTestable
  
  /**
   * Gets or sets the cursor that indicates a valid place to finish creation.
   * 
   * The default cursor is [POINTER][Cursor].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23validEndCursor">Online Documentation</a>
   */
  final var validEndCursor: Cursor?
  
  /**
   * Cancels the editing of this mode.
   * @see [onCanceled]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * Called at the end of the edge creation process if both [startPortCandidate][CreateEdgeInputMode] and [endPortCandidate][CreateEdgeInputMode] have been set.
   * @param [graph] The graph to create the edge for.
   * @param [sourcePortCandidate] The candidate to use for the source end of the edge. Usually the [startPortCandidate][CreateEdgeInputMode]. In case [reversedEdgeCreation][CreateEdgeInputMode], though, the value of [endPortCandidate][CreateEdgeInputMode].
   * @param [targetPortCandidate] The candidate to use for the target end of the edge. Usually the [endPortCandidate][CreateEdgeInputMode]. In case [reversedEdgeCreation][CreateEdgeInputMode], though, the value of [startPortCandidate][CreateEdgeInputMode].
   * @return The edge created, `null`, or a `Promise` resolving with an edge or `null` .
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-createEdge">Online Documentation</a>
   */
  protected open fun createEdge(
    graph: IGraph,
    sourcePortCandidate: IPortCandidate,
    targetPortCandidate: IPortCandidate?,
  ): PromiseResult<IEdge?> /* Promise<IEdge | null> | IEdge */?
  
  /**
   * Returns the input mode context that will be passed to implementations that are called by this instance and require a context.
   * @return A context to use for the implementations that are called by this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-createInputModeContext">Online Documentation</a>
   */
  protected open fun createInputModeContext(): IInputModeContext
  
  /**
   * Creates a preview bend at the given location and adds it to the [previewEdge][CreateEdgeInputMode] that will be displayed by the input mode during the creation.
   * @param [location] The coordinates to create the bend at.
   * @return The newly created bend or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-createPreviewBend">Online Documentation</a>
   */
  protected open fun createPreviewBend(
    location: Point,
  ): IBend?
  
  /**
   * Retrieves the [IPortCandidateProvider] instance that provides the possible candidates for the end of the edge given the current start candidate.
   * @param [startPortCandidate] The candidate at the other end of the edge that has been chosen for the edge creation. In case of [reversedEdgeCreation][CreateEdgeInputMode] this is actually the candidate for the [target end][IEdge] of the edge.
   * @param [location] The location of the mouse.
   * @return The provider to get the port candidates from.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getEndPortCandidateProvider(IPortCandidate,Point)">Online Documentation</a>
   */
  protected open fun getEndPortCandidateProvider(
    startPortCandidate: IPortCandidate,
    location: Point,
  ): IPortCandidateProvider?
  
  /**
   * Retrieves the port candidate provider instance given a start port candidate and a possible ending item.
   * @param [startPortCandidate] The current start port candidate at the other end of the edge.
   * @param [endPortOwner] The [IPortOwner] to find the candidates for.
   * @param [location] The location of the pointer.
   * @return A provider instance or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getEndPortCandidateProvider(IPortCandidate,IPortOwner,Point)">Online Documentation</a>
   */
  protected open fun getEndPortCandidateProvider(
    startPortCandidate: IPortCandidate?,
    endPortOwner: IPortOwner,
    location: Point,
  ): IPortCandidateProvider?
  
  /**
   * Retrieves the end port candidates for a given location in world coordinates.
   * @param [location] The location of the pointer in world coordinates.
   * @param [resolveCandidates] Determines whether [DYNAMIC][PortCandidateValidity] ports should be resolved with respect to the `location` or not.
   * @return A possibly empty enumeration over all end port candidates.
   * @see [startPortCandidate]
   * @see [resolveEndPortCandidates]
   * @see [portCandidateResolutionRecognizer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getEndPortCandidates">Online Documentation</a>
   */
  protected open fun getEndPortCandidates(
    location: Point,
    resolveCandidates: Boolean,
  ): IEnumerable<IPortCandidate>
  
  /**
   * Finds the end [port owner][IPortOwner] at the specified location.
   * @param [endLocation] The location of the pointer at the end of the gesture.
   * @return The port owner or `null` if no valid owner is found at the given location.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getEndPortOwner">Online Documentation</a>
   */
  protected open fun getEndPortOwner(
    endLocation: Point,
  ): IPortOwner?
  
  /**
   * Calculates the direction of the first edge segment of the PreviewNode.
   * @return A [EdgeSegmentDirection] defining the direction of the first edge segment.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getFirstSegmentDirection">Online Documentation</a>
   */
  protected open fun getFirstSegmentDirection(): EdgeSegmentDirection
  
  /**
   * Retrieves the port owner at a given position in world coordinates.
   * @param [location] The position in world coordinates.
   * @return The [IPortOwner] or `null` if no suitable node or edge was found.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getPortOwner">Online Documentation</a>
   */
  protected open fun getPortOwner(
    location: Point,
  ): IPortOwner?
  
  /**
   * Retrieves the port owners from the graph in the order of their importance.
   * @return An enumerable over all [IPortOwner]s in this graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getPortOwners">Online Documentation</a>
   */
  protected open fun getPortOwners(): IEnumerable<IPortOwner>
  
  /**
   * Gets the snap references that are induced by the current preview edge.
   * @param [context] The graph snap context.
   * @return The snap lines induced by the current preview edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getPreviewEdgeSnapLines">Online Documentation</a>
   */
  protected open fun getPreviewEdgeSnapLines(
    context: GraphSnapContext,
  ): IEnumerable<OrthogonalSnapLine>
  
  /**
   * Finds the best matching start [port candidate][IPortCandidate] based on the given location.
   * @param [location] The location where the gesture was initiated.
   * @return The candidate to use or `null`.
   * @see [getStartPortCandidates]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getStartPortCandidate">Online Documentation</a>
   */
  protected fun getStartPortCandidate(
    location: Point,
  ): IPortCandidate?
  
  /**
   * Finds the start [port candidate provider][IPortCandidateProvider] at the specified location.
   * @param [startLocation] The location of the mouse at the beginning of the gesture.
   * @return The port candidate provider to use for the start of the edge creation or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getStartPortCandidateProvider(Point)">Online Documentation</a>
   */
  protected open fun getStartPortCandidateProvider(
    startLocation: Point,
  ): IPortCandidateProvider?
  
  /**
   * Retrieves the port candidate provider instance given a port owner for the start of the gesture.
   * @param [startPortOwner] The [IPortOwner] to find the candidates for.
   * @return A provider instance or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getStartPortCandidateProvider(IPortOwner)">Online Documentation</a>
   */
  protected open fun getStartPortCandidateProvider(
    startPortOwner: IPortOwner,
  ): IPortCandidateProvider?
  
  /**
   * Gets the start port candidates for the given `location`.
   * @param [location] The location to get the port candidates for.
   * @return The port candidates for the given location or `null` if there are none.
   * @see [getStartPortOwner]
   * @see [getStartPortCandidateProvider]
   * @see [IPortCandidateProvider.getAllSourcePortCandidates]
   * @see [IPortCandidateProvider.getAllTargetPortCandidates]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getStartPortCandidates">Online Documentation</a>
   */
  protected open fun getStartPortCandidates(
    location: Point,
  ): IEnumerable<IPortCandidate>?
  
  /**
   * Finds the start [port owner][IPortOwner] at the specified location.
   * @param [startingLocation] The location of the pointer at the beginning of the gesture.
   * @return The port owner to use for the start of the edge creation or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getStartPortOwner">Online Documentation</a>
   */
  protected open fun getStartPortOwner(
    startingLocation: Point,
  ): IPortOwner?
  
  /**
   * Installs this mode into the given context that is provided by the canvas.
   * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [uninstall][IInputMode]. A reference to the context may be kept and queried during the time the mode is installed.
   * @param [controller] The [controller][CreateEdgeInputMode] for this mode.
   * @see [IInputMode.uninstall]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Gets or sets a value that specifies whether the current focus owner is valid as an intermediate focus owner and does not count against [cancelCreationOnFocusLost][CreateEdgeInputMode].
   * @return Whether it is OK for the focus to be temporarily moved away from the [CanvasComponent][yfiles.view.CanvasComponent] to the current focus owner. If `false` the edge creation will be [canceled][CreateEdgeInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-isValidTemporaryFocusTarget">Online Documentation</a>
   */
  protected open fun isValidTemporaryFocusTarget(): Boolean
  
  /**
   * Measures the distance between a port `candidate` and a given `location`.
   * @param [candidate] The port candidate.
   * @param [location] The location in world coordinates.
   * @return The distance between the `candidate` and the `location` (in world coordinates if no [projection][yfiles.view.CanvasComponent] is set; in view coordinates if it has).
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-measureDistance">Online Documentation</a>
   */
  protected fun measureDistance(
    candidate: IPortCandidate,
    location: Point,
  ): Double
  
  /**
   * Called after [cancel][CreateEdgeInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled()
  
  /**
   * Called after the [ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerActivated()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerDeactivated()
  
  /**
   * Called after the edge has been finalized.
   * @param [event] The event argument holding the edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onEdgeCreated">Online Documentation</a>
   */
  protected open fun onEdgeCreated(
    event: InputModeItemEventArgs<IEdge>,
  )
  
  /**
   * Raises the [edge-creation-started][CreateEdgeInputMode] event when the edge is dragged outside the start node.
   * @param [event] The [InputModeItemEventArgs] instance containing the preview edge that will be used during edge creation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onEdgeCreationStarted">Online Documentation</a>
   */
  protected open fun onEdgeCreationStarted(
    event: InputModeItemEventArgs<IEdge>,
  )
  
  /**
   * Triggers the [edge-direction-reversed][CreateEdgeInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onEdgeDirectionReversed">Online Documentation</a>
   */
  protected open fun onEdgeDirectionReversed(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggers the [end-port-candidate-changed][CreateEdgeInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onEndPortCandidateChanged">Online Documentation</a>
   */
  protected open fun onEndPortCandidateChanged(
    event: InputModeItemEventArgs<IPortCandidate>,
  )
  
  /**
   * Triggers the [gesture-canceled][CreateEdgeInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onGestureCanceled">Online Documentation</a>
   */
  protected open fun onGestureCanceled(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggers the [gesture-canceling][CreateEdgeInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onGestureCanceling">Online Documentation</a>
   */
  protected open fun onGestureCanceling(
    event: InputModeEventArgs,
  )
  
  /**
   * Called once the drag has been finalized.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onGestureFinished">Online Documentation</a>
   */
  protected open fun onGestureFinished(
    event: InputModeEventArgs,
  )
  
  /**
   * Called before the drag will be finalized.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onGestureFinishing">Online Documentation</a>
   */
  protected open fun onGestureFinishing(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggers the [gesture-started][CreateEdgeInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onGestureStarted">Online Documentation</a>
   */
  protected open fun onGestureStarted(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggers the [gesture-starting][CreateEdgeInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onGestureStarting">Online Documentation</a>
   */
  protected open fun onGestureStarting(
    event: InputModeEventArgs,
  )
  
  /**
   * Called at the end of each drag.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onMoved">Online Documentation</a>
   */
  protected open fun onMoved(
    event: InputModeEventArgs,
  )
  
  /**
   * Called at the start of each drag.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onMoving">Online Documentation</a>
   */
  protected open fun onMoving(
    event: InputModeEventArgs,
  )
  
  /**
   * Raises the [port-added][CreateEdgeInputMode] event if the mode has [added a port][IGraph] for the source or target node to complete the edge creation.
   * @param [event] The [InputModeItemEventArgs] instance containing the port that has been added.
   * @see [port-added]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onPortAdded">Online Documentation</a>
   */
  protected open fun onPortAdded(
    event: InputModeItemEventArgs<IPort>,
  )
  
  /**
   * Called when the [reversedEdgeCreation][CreateEdgeInputMode] property changes and the edge creation is [in progress][CreateEdgeInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onReversedEdgeCreationChanged">Online Documentation</a>
   */
  protected open fun onReversedEdgeCreationChanged()
  
  /**
   * Triggers the [start-port-candidate-changed][CreateEdgeInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onStartPortCandidateChanged">Online Documentation</a>
   */
  protected open fun onStartPortCandidateChanged(
    event: InputModeItemEventArgs<IPortCandidate>,
  )
  
  /**
   * Called after [tryStop][CreateEdgeInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onStopped">Online Documentation</a>
   */
  protected open fun onStopped()
  
  /**
   * Sets the position of the dragged end of the edge during creation.
   * @param [newLocation] The location of the tip of the edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-relocateDragPoint">Online Documentation</a>
   */
  protected open fun relocateDragPoint(
    newLocation: Point,
  )
  
  /**
   * Returns an enumerable over the given candidates where no instance has [DYNAMIC][PortCandidateValidity] [validity][IPortCandidate].
   * @param [candidates] The candidates to possibly resolve.
   * @param [location] The location to resolve dynamic candidates against or `null` if they should be discarded instead.
   * @return An enumerable of non-[DYNAMIC][PortCandidateValidity] port candidates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-resolveCandidates">Online Documentation</a>
   */
  protected open fun resolveCandidates(
    candidates: IEnumerable<IPortCandidate>,
    location: Point?,
  ): IEnumerable<IPortCandidate>
  
  /**
   * Finds the closest [VALID][PortCandidateValidity] candidate given a number of [IPortCandidate]s and a location in world coordinates.
   * @param [candidates] The candidates to find the closest from.
   * @param [location] The location of the mouse in world coordinates.
   * @return The candidate to use or `null` if no candidate satisfies the needs
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-selectClosestCandidate">Online Documentation</a>
   */
  protected open fun selectClosestCandidate(
    candidates: IEnumerable<IPortCandidate>,
    location: Point,
  ): IPortCandidate?
  
  /**
   * Finds the closest end candidate given a number of [IPortCandidate]s and a location in world coordinates.
   * @param [candidates] The candidates to find the closest from.
   * @param [location] The location of the mouse in world coordinates.
   * @return The candidate to use or `null` if no candidate satisfies the needs or [enforceBendCreationRecognizer][CreateEdgeInputMode] yields `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-selectClosestEndCandidate">Online Documentation</a>
   */
  protected open fun selectClosestEndCandidate(
    candidates: IEnumerable<IPortCandidate>,
    location: Point,
  ): IPortCandidate?
  
  /**
   * Finds the closest candidate given a number of [IPortCandidate]s and a location in world coordinates.
   * @param [candidates] The candidates to find the closest from.
   * @param [location] The location of the pointer in world coordinates.
   * @return The candidate to use or `null` if no candidate satisfies the needs
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-selectClosestStartCandidate">Online Documentation</a>
   */
  protected open fun selectClosestStartCandidate(
    candidates: IEnumerable<IPortCandidate>,
    location: Point,
  ): IPortCandidate?
  
  /**
   * Finds the best matching start port [IPortCandidate] for the given `candidates` at the provided `location`.
   * @param [candidates] The candidates.
   * @param [location] The location where the gesture was initiated.
   * @param [resolveCandidates] Determines whether [DYNAMIC][PortCandidateValidity] ports should be resolved with respect to the `location` or not.
   * @return The candidate to use or `null`.
   * @see [resolveStartPortCandidates]
   * @see [portCandidateResolutionRecognizer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-selectStartPortCandidate">Online Documentation</a>
   */
  protected open fun selectStartPortCandidate(
    candidates: IEnumerable<IPortCandidate>,
    location: Point,
    resolveCandidates: Boolean,
  ): IPortCandidate?
  
  /**
   * Synthetically starts the interactive edge creation process using the provided [INode] as the start node.
   * @param [node] The start node to use for the edge creation.
   * @param [initialEndLocation] The initial location that is passed to [updateEndLocation][CreateEdgeInputMode].
   * @return A task that represents the asynchronous edge creation. The result of the task contains the newly created edge or `null` if the creation was canceled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-startEdgeCreation(INode,IPoint)">Online Documentation</a>
   */
  open fun startEdgeCreation(
    node: INode,
    initialEndLocation: IPoint?  = definedExternally,
  ): Promise<IEdge?>
  
  /**
   * Synthetically starts the interactive edge creation process using the provided [IPort] as the start port.
   * @param [port] The start port to use for the edge creation.
   * @param [initialEndLocation] The initial location that is passed to [updateEndLocation][CreateEdgeInputMode].
   * @return A task that represents the asynchronous edge creation. The result of the task contains the newly created edge or `null` if the creation was canceled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-startEdgeCreation(IPort,IPoint)">Online Documentation</a>
   */
  open fun startEdgeCreation(
    port: IPort,
    initialEndLocation: IPoint?  = definedExternally,
  ): Promise<IEdge?>
  
  /**
   * Synthetically starts the interactive edge creation process using the provided [IPortCandidate] as the start port.
   * @param [startPortCandidate] The start port candidate to use for the edge creation.
   * @param [initialEndLocation] The initial location that is passed to [updateEndLocation][CreateEdgeInputMode].
   * @return A task that represents the asynchronous edge creation. The result of the task contains the newly created edge or `null` if the creation was canceled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-startEdgeCreation(IPortCandidate,IPoint)">Online Documentation</a>
   */
  open fun startEdgeCreation(
    startPortCandidate: IPortCandidate,
    initialEndLocation: IPoint?  = definedExternally,
  ): Promise<IEdge?>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-tryStop">Online Documentation</a>
   */
  override fun tryStop(): Boolean
  
  /**
   * Uninstalls this mode from the given context.
   * @param [context] The context to deregister from. This is the same instance that had been passed to [install][IInputMode] during installation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
  /**
   * Draws the highlight for the owner of the current [endPortCandidate][CreateEdgeInputMode].
   * @param [oldCandidate] The port candidate whose owner is currently highlighted.
   * @param [newCandidate] The port candidate whose owner should be highlighted.
   * @see [showEndHighlight]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-updateEndHighlight">Online Documentation</a>
   */
  protected open fun updateEndHighlight(
    oldCandidate: IPortCandidate?,
    newCandidate: IPortCandidate?,
  )
  
  /**
   * Updates the dragged end point of the edge.
   * @param [location] The new coordinates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-updateEndLocation">Online Documentation</a>
   */
  protected open fun updateEndLocation(
    location: Point,
  )
  
  /**
   * Updates the [previewEdge][CreateEdgeInputMode] to reflect the current end port candidate.
   * @param [endPortCandidate] The new end port candidate.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-updatePreviewEdgeEndPort">Online Documentation</a>
   */
  protected open fun updatePreviewEdgeEndPort(
    endPortCandidate: IPortCandidate?,
  )
  
  /**
   * Updates the [previewEdge][CreateEdgeInputMode] to reflect the current start port candidate.
   * @param [startPortCandidate] The new start port candidate.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-updatePreviewEdgeStartPort">Online Documentation</a>
   */
  protected open fun updatePreviewEdgeStartPort(
    startPortCandidate: IPortCandidate?,
  )
  
  companion object : ClassMetadata<CreateEdgeInputMode> {
  }
}

inline fun CreateEdgeInputMode(
    block: CreateEdgeInputMode.() -> Unit
): CreateEdgeInputMode {
    return CreateEdgeInputMode()
        .apply(block)
}

/**
 * `start-port-candidate-changed`: Occurs when the value of the [startPortCandidate][CreateEdgeInputMode] property changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23start-port-candidate-changed">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addStartPortCandidateChangedHandler(
  crossinline handler: (event:InputModeItemEventArgs<IPortCandidate>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<IPortCandidate>> = { event, _ -> handler(event) }
  addEventListener("start-port-candidate-changed", listener)
  return { removeEventListener("start-port-candidate-changed", listener) }
}

/**
 * `end-port-candidate-changed`: Occurs when the value of the [endPortCandidate][CreateEdgeInputMode] property changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23end-port-candidate-changed">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addEndPortCandidateChangedHandler(
  crossinline handler: (event:InputModeItemEventArgs<IPortCandidate>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<IPortCandidate>> = { event, _ -> handler(event) }
  addEventListener("end-port-candidate-changed", listener)
  return { removeEventListener("end-port-candidate-changed", listener) }
}

/**
 * `edge-created`: Occurs after an edge has been created by this mode.
 * @see [addOnEdgeCreatedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23edge-created">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addEdgeCreatedHandler(
  crossinline handler: (event:InputModeItemEventArgs<IEdge>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<IEdge>> = { event, _ -> handler(event) }
  addEventListener("edge-created", listener)
  return { removeEventListener("edge-created", listener) }
}

/**
 * `port-added`: Occurs when this instance [adds a port][IGraph] to the source or target node during completion of the edge creation gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23port-added">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addPortAddedHandler(
  crossinline handler: (event:InputModeItemEventArgs<IPort>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<IPort>> = { event, _ -> handler(event) }
  addEventListener("port-added", listener)
  return { removeEventListener("port-added", listener) }
}

/**
 * `gesture-finishing`: Occurs before the gesture will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23gesture-finishing">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addGestureFinishingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("gesture-finishing", listener)
  return { removeEventListener("gesture-finishing", listener) }
}

/**
 * `gesture-finished`: Occurs once the gesture has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23gesture-finished">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addGestureFinishedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("gesture-finished", listener)
  return { removeEventListener("gesture-finished", listener) }
}

/**
 * `gesture-starting`: Occurs once the actual creation gesture starts, that is when starting to drag gesture from the start, but before [edge-creation-started][CreateEdgeInputMode], which fires only when it becomes visible.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23gesture-starting">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addGestureStartingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("gesture-starting", listener)
  return { removeEventListener("gesture-starting", listener) }
}

/**
 * `gesture-started`: Occurs once the actual creation gesture is initialized and has started, that is when the edge is dragged from its start, but before [edge-creation-started][CreateEdgeInputMode] which fires only when it becomes visible.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23gesture-started">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addGestureStartedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("gesture-started", listener)
  return { removeEventListener("gesture-started", listener) }
}

/**
 * `edge-direction-reversed`: Occurs when the direction of the edge creation changed during edge creation.
 * @see [addReversedEdgeCreationHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23edge-direction-reversed">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addEdgeDirectionReversedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("edge-direction-reversed", listener)
  return { removeEventListener("edge-direction-reversed", listener) }
}

/**
 * `moving`: Occurs at the start of every drag or move.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23moving">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addMovingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("moving", listener)
  return { removeEventListener("moving", listener) }
}

/**
 * `moved`: Occurs at the end of every drag or move.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23moved">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addMovedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("moved", listener)
  return { removeEventListener("moved", listener) }
}

/**
 * `gesture-canceled`: Occurs when the gesture has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23gesture-canceled">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addGestureCanceledHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("gesture-canceled", listener)
  return { removeEventListener("gesture-canceled", listener) }
}

/**
 * `gesture-canceling`: Occurs before the gesture will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23gesture-canceling">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addGestureCancelingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("gesture-canceling", listener)
  return { removeEventListener("gesture-canceling", listener) }
}

/**
 * `edge-creation-started`: Occurs when the edge creation has visibly started, that is when the cursor is dragged outside the start node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23edge-creation-started">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addEdgeCreationStartedHandler(
  crossinline handler: (event:InputModeItemEventArgs<IEdge>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<IEdge>> = { event, _ -> handler(event) }
  addEventListener("edge-creation-started", listener)
  return { removeEventListener("edge-creation-started", listener) }
}
