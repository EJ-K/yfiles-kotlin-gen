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
import yfiles.collections.ItemEventArgs
import yfiles.geometry.IPoint
import yfiles.geometry.Point
import yfiles.graph.EdgeEventArgs
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
import yfiles.view.Cursor
import yfiles.view.ICanvasObjectDescriptor

/**
 * An [IInputMode] for interactively creating edges between nodes and edges in an [IGraph] displayed in a [CanvasComponent][yfiles.view.CanvasComponent] or [GraphComponent][yfiles.view.GraphComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance that will use the [IGraph] from the [inputModeContext] to create edges in.
 * @see [graph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-constructor-CreateEdgeInputMode">Online Documentation</a>
 */
external open class CreateEdgeInputMode  () : IInputMode, IEventDispatcher {

/**
 * Gets or sets whether or not to allow the creation of bends.
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
 * Gets or sets whether or not to allow the creation of self loops.
 * 
 * The default is `true`, which enables that an edge is connected to a [IEdge.sourcePort] and [IEdge.targetPort] that have the same [IPort.owner].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23allowSelfloops">Online Documentation</a>
 */
final var allowSelfloops: Boolean
/**
 * Gets or sets a [IHitTestable] that determines whether it is valid to start an edge creation gesture here.
 * 
 * The default implementation returns `true` if the cursor is located over a port owner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23beginHitTestable">Online Documentation</a>
 */
final var beginHitTestable: IHitTestable
/**
 * Gets or sets whether after calls to [createEdge] the current undo edit should be canceled if the method returns `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23cancelEditImplicitly">Online Documentation</a>
 */
final var cancelEditImplicitly: Boolean
/**
 * Gets or sets whether an edge creation gesture will be canceled when the gesture is ended on an invalid target and no bend may be created there.
 * @see [allowCreateBend]
 * @see [validBendHitTestable]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23cancelGestureOnInvalidTarget">Online Documentation</a>
 */
final var cancelGestureOnInvalidTarget: Boolean
/**
 * Gets or sets the event recognizer that determines whether to cancel edge creation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23cancelRecognizer">Online Documentation</a>
 */
final var cancelRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to cancel edge creation via touch.
 * 
 * The default is [TouchEventRecognizers.TOUCH_MULTI_TAP_SECONDARY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23cancelRecognizerTouch">Online Documentation</a>
 */
final var cancelRecognizerTouch: EventRecognizer
/**
 * Gets or sets the [ICanvasObjectDescriptor] that is used for visualizing the [IPortCandidate]s in the canvas during the edit.
 * @see [closestCandidateDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23candidateDescriptor">Online Documentation</a>
 */
final var candidateDescriptor: ICanvasObjectDescriptor<IPortCandidate>
/**
 * Gets or sets the [ICanvasObjectDescriptor] that is used for visualizing the closest [IPortCandidate] in the canvas during the edit.
 * @see [candidateDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23closestCandidateDescriptor">Online Documentation</a>
 */
final var closestCandidateDescriptor: ICanvasObjectDescriptor<IPortCandidate>
/**
 * Gets the installed [controller].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23controller">Online Documentation</a>
 */
protected final val controller: ConcurrencyController?
/**
 * Gets or sets the event recognizer that determines whether to create a bend.
 * 
 * The default is [MouseEventRecognizers.LEFT_UP].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23createBendRecognizer">Online Documentation</a>
 */
final var createBendRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to create a bend via touch.
 * 
 * The default is [TouchEventRecognizers.TOUCH_UP_PRIMARY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23createBendRecognizerTouch">Online Documentation</a>
 */
final var createBendRecognizerTouch: EventRecognizer
/**
 * Gets or sets event recognizer that temporarily disables snapping.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23disableSnappingRecognizer">Online Documentation</a>
 */
final var disableSnappingRecognizer: EventRecognizer
/**
 * Gets or sets the cursor that is used while a new edge is created when there is no [valid location][validBendHitTestable] to create a bend.
 * 
 * The default cursor is [Cursor.DEFAULT].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23dragCursor">Online Documentation</a>
 */
final var dragCursor: Cursor?
/**
 * Gets the dynamically updated dragging point for the edge creation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23dragPoint">Online Documentation</a>
 */
final val dragPoint: IPoint
/**
 * Gets or sets the event recognizer that recognizes the initial dragging gesture that is used to initiate the creation after the preparation.
 * 
 * The default is [MouseEventRecognizers.DRAG].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23draggedRecognizer">Online Documentation</a>
 */
final var draggedRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that recognizes the initial dragging gesture that is used to initiate the creation after the preparation via touch.
 * 
 * The default is [TouchEventRecognizers.TOUCH_MOVE_PRIMARY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23draggedRecognizerTouch">Online Documentation</a>
 */
final var draggedRecognizerTouch: EventRecognizer
/**
 * Gets the dummy edge instance that will be used to render a preview of the edge to be created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23dummyEdge">Online Documentation</a>
 */
final val dummyEdge: IEdge
/**
 * Gets the dummy graph instance that will hold the items that will render a preview of the newly created edge.
 * @see [dummyEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23dummyEdgeGraph">Online Documentation</a>
 */
final val dummyEdgeGraph: IGraph
/**
 * The [IPort] which is used as source port for the temporarily created [dummyEdge] during edge creation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23dummySourceNodePort">Online Documentation</a>
 */
protected final val dummySourceNodePort: IPort
/**
 * The [INode] which is used as target node for the temporarily created [dummyEdge] during edge creation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23dummyTargetNode">Online Documentation</a>
 */
final val dummyTargetNode: INode
/**
 * The [IPort] which is used as target port for the temporarily created [dummyEdge] during edge creation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23dummyTargetNodePort">Online Documentation</a>
 */
final val dummyTargetNodePort: IPort
/**
 * Gets or sets the ports based edge creation callback.
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
 * Gets or sets event recognizer that reenables temporarily disabled snapping.
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
 * The default is [MouseEventRecognizers.MOVE_OR_DRAG].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23endPointMovedRecognizer">Online Documentation</a>
 */
final var endPointMovedRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that will be queried to decide if bend creation is enforced.
 * 
 * The default is [KeyEventRecognizers.CTRL_IS_DOWN] or [KeyEventRecognizers.META_IS_DOWN].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23enforceBendCreationRecognizer">Online Documentation</a>
 */
final var enforceBendCreationRecognizer: EventRecognizer
/**
 * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23exclusive">Online Documentation</a>
 */
final var exclusive: Boolean
/**
 * Gets or sets the event recognizer that recognizes the finishing gesture that is used to end the edge creation on the target node.
 * 
 * The default is a combination of [MouseEventRecognizers.LEFT_DOWN] and [MouseEventRecognizers.LEFT_UP].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23finishRecognizer">Online Documentation</a>
 */
final var finishRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that recognizes the finishing gesture that is used to end the edge creation on the target node by a touch gesture.
 * 
 * The default is [TouchEventRecognizers.TOUCH_UP_PRIMARY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23finishRecognizerTouch">Online Documentation</a>
 */
final var finishRecognizerTouch: EventRecognizer
/**
 * Gets or sets a property that determines whether the mouse should be forced to snap to the nearest valid port candidate if the mouse hovers over a target node.
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
/**
 * Gets whether currently an edge creation is in progress.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23isCreationInProgress">Online Documentation</a>
 */
open val isCreationInProgress: Boolean
/**
 * Gets or sets the width of a node's border which is taken into account when deciding which way to route the first segment of an orthogonal edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23nodeBorderWidthRatio">Online Documentation</a>
 */
final var nodeBorderWidthRatio: Double
/**
 * Gets or sets the policy that controls whether edges will be create orthogonally.
 * 
 * By default orthogonal edge creation is enabled if orthogonal edge editing is enabled on the [parent input mode][GraphEditorInputMode].
 * @see [GraphEditorInputMode.orthogonalEdgeEditingContext]
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
 * Gets or sets the event recognizer that determines whether dynamic port candidates should be resolved.
 * 
 * By default this is [KeyEventRecognizers.SHIFT_IS_DOWN].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23portCandidateResolutionRecognizer">Online Documentation</a>
 */
final var portCandidateResolutionRecognizer: EventRecognizer
/**
 * Gets or sets the preferred minimal distance of orthogonal edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23preferredMinimalEdgeDistance">Online Documentation</a>
 */
final var preferredMinimalEdgeDistance: Double
/**
 * Gets or sets a [IHitTestable] that determines, whether it is valid to finish an edge creation gesture here even if no [IPortCandidate]s are available.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23prematureEndHitTestable">Online Documentation</a>
 */
final var prematureEndHitTestable: IHitTestable
/**
 * Gets or sets the event recognizer that recognizes the starting gesture that is used to prepare the edge creation on the source node.
 * 
 * The default is [MouseEventRecognizers.LEFT_DOWN].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23prepareRecognizer">Online Documentation</a>
 */
final var prepareRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that recognizes the starting gesture that is used to prepare the edge creation on the source node via touch.
 * 
 * The default is [TouchEventRecognizers.TOUCH_LONG_PRESS_PRIMARY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23prepareRecognizerTouch">Online Documentation</a>
 */
final var prepareRecognizerTouch: EventRecognizer
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23priority">Online Documentation</a>
 */
final override var priority: Int
/**
 * Gets or sets the event recognizer that determines whether to remove bends.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23removeBendRecognizer">Online Documentation</a>
 */
final var removeBendRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer determines whether to remove bends via touch.
 * 
 * The default is [TouchEventRecognizers.TOUCH_LONG_PRESS_SECONDARY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23removeBendRecognizerTouch">Online Documentation</a>
 */
final var removeBendRecognizerTouch: EventRecognizer
/**
 * Gets or sets a value indicating whether [PortCandidateValidity.DYNAMIC] ports that are part of the [source port candidates][getSourcePortCandidates] should be resolved for the current mouse location.
 * @see [portCandidateResolutionRecognizer]
 * @see [resolveCandidates]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23resolveSourcePortCandidates">Online Documentation</a>
 */
final var resolveSourcePortCandidates: Boolean
/**
 * Gets or sets a value indicating whether [PortCandidateValidity.DYNAMIC] ports that are part of the [target port candidates][getTargetPortCandidates] should be resolved for the current mouse location.
 * 
 * By default this feature is enabled and the [portCandidateResolutionRecognizer] is configured so that the resolution mechanism is used if the user holds the shift modifier during the gesture.
 * @see [portCandidateResolutionRecognizer]
 * @see [resolveCandidates]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23resolveTargetPortCandidates">Online Documentation</a>
 */
final var resolveTargetPortCandidates: Boolean
/**
 * Gets or sets a value indicating whether the current edge creation should be created from [its target port][IEdge.targetPort] to [its source port][IEdge.sourcePort].
 * @see [edgeDirectionPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23reversedEdgeCreation">Online Documentation</a>
 */
final var reversedEdgeCreation: Boolean
/**
 * Gets or sets whether and where to display possible port candidates during the creation of the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23showPortCandidates">Online Documentation</a>
 */
final var showPortCandidates: ShowPortCandidates
/**
 * Gets or sets a [IHitTestable] that determines whether to show source port candidates if the cursor hovers over the provided location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23showSourcePortCandidatesHitTestable">Online Documentation</a>
 */
final var showSourcePortCandidatesHitTestable: IHitTestable
/**
 * Gets or sets whether the owner of the current [targetPortCandidate] should be highlighted.
 * 
 * The default is `true`.
 * @see [updateTargetHighlight]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23showTargetHighlight">Online Documentation</a>
 */
final var showTargetHighlight: Boolean
/**
 * Gets or sets the [snapContext] which manages snapping model items to certain coordinates (for instance, other items).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23snapContext">Online Documentation</a>
 */
final var snapContext: SnapContext?
/**
 * Gets or sets the distance in the view coordinate system that determines how far the mouse should be snapped to a port candidate if [snapToTargetCandidate] is enabled.
 * 
 * The default value is `20`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23snapDistance">Online Documentation</a>
 */
final var snapDistance: Double
/**
 * Gets or sets whether or not the edge's end point should snap to the current target port candidate during the creation of the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23snapToTargetCandidate">Online Documentation</a>
 */
final var snapToTargetCandidate: Boolean
/**
 * Gets or sets the cursor that is used once edge creation has started but the mouse is still over the new edge's source node.
 * 
 * The default cursor is [Cursor.DEFAULT].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23sourceNodeDraggingCursor">Online Documentation</a>
 */
final var sourceNodeDraggingCursor: Cursor?
/**
 * Gets or sets the event recognizer that starts the actual edge creation while dragging.
 * 
 * The default implementation starts edge creation after the mouse pointer has left the source node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23sourceNodeDraggingFinishedRecognizer">Online Documentation</a>
 */
final var sourceNodeDraggingFinishedRecognizer: EventRecognizer
/**
 * Gets or sets the candidate for the [IEdge.sourcePort] of the edge to be created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23sourcePortCandidate">Online Documentation</a>
 */
final var sourcePortCandidate: IPortCandidate?
/**
 * Gets or sets the radius from within a valid port candidate will be considered as hit.
 * @see [startOverCandidateOnly]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23sourcePortCandidateHitRadius">Online Documentation</a>
 */
final var sourcePortCandidateHitRadius: Double
/**
 * Gets or sets whether edge creation should only start if the pointer is located directly over a valid port candidate.
 * @see [sourcePortCandidateHitRadius]
 * @see [showPortCandidates]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23startOverCandidateOnly">Online Documentation</a>
 */
final var startOverCandidateOnly: Boolean
/**
 * Gets a copy of the starting point at which the edge creation gesture started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23startPoint">Online Documentation</a>
 */
final val startPoint: Point
/**
 * Gets or sets the current candidate for the [IEdge.targetPort] of the edge to be created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23targetPortCandidate">Online Documentation</a>
 */
final var targetPortCandidate: IPortCandidate?
/**
 * Gets or sets the event recognizer that recognizes gesture which toggles the [direction][reversedEdgeCreation] of the created edge.
 * 
 * The default instance never triggers.
 * @see [edgeDirectionPolicy]
 * @see [onReversedEdgeCreationChanged]
 * @see [reversedEdgeCreation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23toggleDirectionRecognizer">Online Documentation</a>
 */
final var toggleDirectionRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that toggles the orientation of the first orthogonally created segment.
 * @see [orthogonalEdgeCreation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23toggleSegmentOrientationRecognizer">Online Documentation</a>
 */
final var toggleSegmentOrientationRecognizer: EventRecognizer
/**
 * Gets or sets a property that determines whether this mode should use only the [target port candidates][getTargetPortCandidates] of the node the mouse currently hovers over.
 * 
 * The default is `true`.
 * @see [showPortCandidates]
 * @see [getTarget]
 * @see [getTargetPortCandidates]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23useHitItemsCandidatesOnly">Online Documentation</a>
 */
final var useHitItemsCandidatesOnly: Boolean
/**
 * Gets or sets the cursor that indicates a valid place to begin an edge creation.
 * 
 * The default cursor is [Cursor.POINTER].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23validBeginCursor">Online Documentation</a>
 */
final var validBeginCursor: Cursor?
/**
 * Gets or sets the cursor that indicates a valid place to create a bend.
 * 
 * The default cursor is [Cursor.DEFAULT].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23validBendCursor">Online Documentation</a>
 */
final var validBendCursor: Cursor?
/**
 * Gets or sets a [IHitTestable] that determines whether it is valid to create a bend here.
 * 
 * The default implementation returns always `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23validBendHitTestable">Online Documentation</a>
 */
final var validBendHitTestable: IHitTestable
/**
 * Gets or sets the cursor that indicates a valid place to finish creation.
 * 
 * The default cursor is [Cursor.POINTER].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23validEndCursor">Online Documentation</a>
 */
final var validEndCursor: Cursor?
/**
 * Cancels the editing of this mode.
 * @see [onCanceled]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-cancel">Online Documentation</a>
 */
 override   fun cancel()
/**
 * Creates a dummy bend at the given location and adds it to the [dummyEdge] that will be displayed by the input mode during the creation.
 * @param [location] The coordinates to create the bend at.
 * @return The newly created bend or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-createDummyBend">Online Documentation</a>
 */
 open protected   fun createDummyBend( location: Point ):IBend?
/**
 * Creates the dummy edge that will be displayed by the input mode during the creation.
 * @return An [IEdge] implementation that can be used as a dummy.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-createDummyEdge">Online Documentation</a>
 */
 open protected   fun createDummyEdge():IEdge
/**
 * Factory method that will create the dummy graph to hold the preview of the [dummyEdge].
 * @return A graph instance that will be rendered as a preview.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-createDummyEdgeGraph">Online Documentation</a>
 */
 open protected   fun createDummyEdgeGraph():IGraph
/**
 * Creates the dummy node which is used as target for the [dummyEdge] during the creation.
 * @return An [INode] implementation that can be used as a dummy.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-createDummyTargetNode">Online Documentation</a>
 */
 open protected   fun createDummyTargetNode():INode
/**
 * Creates the dummy port which is used as target for the [dummyEdge] during the creation.
 * @return An [IPort] implementation that can be used as a dummy.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-createDummyTargetNodePort">Online Documentation</a>
 */
 open protected   fun createDummyTargetNodePort():IPort
/**
 * Called at the end of the edge creation process if both [sourcePortCandidate] and [targetPortCandidate] have been set.
 * @param [graph] The graph to create the edge for.
 * @param [sourcePortCandidate] The candidate to use for the source end of the edge. Usually the [sourcePortCandidate]. In case [reverse edge creation][reversedEdgeCreation], though, the value of [targetPortCandidate].
 * @param [targetPortCandidate] The candidate to use for the target end of the edge. Usually the [targetPortCandidate]. In case [reverse edge creation][reversedEdgeCreation], though, the value of [sourcePortCandidate].
 * @return The edge created, `null`, or a `Promise` resolving with an edge or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-createEdge">Online Documentation</a>
 */
 open protected   fun createEdge( graph: IGraph ,
 sourcePortCandidate: IPortCandidate ,
 targetPortCandidate: IPortCandidate? ):PromiseResult<IEdge?> /* Promise<IEdge | null> | IEdge */?
/**
 * Creates an [IInputModeContext] for use with the port candidates queries for the upcoming edge creation operation and the actual edge creation
 * @return An instance of [IInputModeContext] that is configured for this mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-createEdgeCreationInputModeContext">Online Documentation</a>
 */
 open protected   fun createEdgeCreationInputModeContext():IInputModeContext
/**
 * Synthetically starts the interactive edge creation process using the provided [IPortCandidate] as the source port.
 * @param [sourcePortCandidate] The source port candidate to use for the edge creation.
 * @param [initialTargetLocation] The initial location that is passed to [updateTargetLocation].
 * @return A task that represents the asynchronous edge creation. The result of the task contains the newly created edge or `null` if the creation was canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-doStartEdgeCreation">Online Documentation</a>
 */
 open   fun doStartEdgeCreation( sourcePortCandidate: IPortCandidate ,
 initialTargetLocation: IPoint?  = definedExternally):Promise<IEdge?>
/**
 * Finds the closest [PortCandidateValidity.VALID] candidate given a number of [IPortCandidate]s and a location in world coordinates.
 * @param [candidates] The candidates to find the closest from.
 * @param [location] The location of the mouse in world coordinates.
 * @return The candidate to use or `null` if no candidate satisfies the needs
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getClosestCandidate">Online Documentation</a>
 */
 open protected   fun getClosestCandidate( candidates: IEnumerable<IPortCandidate> ,
 location: Point ):IPortCandidate?
/**
 * Finds the closest candidate given a number of [IPortCandidate]s and a location in world coordinates.
 * @param [candidates] The candidates to find the closest from.
 * @param [location] The location of the pointer in world coordinates.
 * @return The candidate to use or `null` if no candidate satisfies the needs
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getClosestSourceCandidate">Online Documentation</a>
 */
 open protected   fun getClosestSourceCandidate( candidates: IEnumerable<IPortCandidate> ,
 location: Point ):IPortCandidate?
/**
 * Finds the closest target candidate given a number of [IPortCandidate]s and a location in world coordinates.
 * @param [candidates] The candidates to find the closest from.
 * @param [location] The location of the mouse in world coordinates.
 * @return The candidate to use or `null` if no candidate satisfies the needs or [enforceBendCreationRecognizer] yields `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getClosestTargetCandidate">Online Documentation</a>
 */
 open protected   fun getClosestTargetCandidate( candidates: IEnumerable<IPortCandidate> ,
 location: Point ):IPortCandidate?
/**
 * Gets the snap lines lines that are induced by the current dummy edge.
 * @param [context] The graph snap context.
 * @param [provider] The dummy edge segment snap line provider.
 * @return The snap lines induced by the current dummy edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getDummyEdgeSnapLines">Online Documentation</a>
 */
 open protected   fun getDummyEdgeSnapLines( context: GraphSnapContext ,
 provider: ISnapLineProvider<IEdge> ):IEnumerable<OrthogonalSnapLine>
/**
 * Calculates direction of first edge segment of the DummyNode.
 * @return A [EdgeSegmentDirection] defining the direction of the first edge segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getFirstSegmentDirection">Online Documentation</a>
 */
 open protected   fun getFirstSegmentDirection():EdgeSegmentDirection
/**
 * Retrieves the port owner at a given position in world coordinates.
 * @param [location] The position in world coordinates.
 * @return The node or `null` if no suitable node was found.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getPortOwner">Online Documentation</a>
 */
 open protected   fun getPortOwner( location: Point ):IPortOwner?
/**
 * Retrieves the port owners from the graph in the order of their importance.
 * @return An enumerable over all [IPortOwner]s in this graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getPortOwners">Online Documentation</a>
 */
 open protected   fun getPortOwners():IEnumerable<IPortOwner>
/**
 * Finds the source [port owner][IPortOwner] at the specified location.
 * @param [sourceLocation] The location of the mouse at the beginning of the gesture.
 * @return The port owner to use for the source of the edge creation or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getSource">Online Documentation</a>
 */
 open protected   fun getSource( sourceLocation: Point ):IPortOwner?
/**
 * Finds the best matching source port [IPortCandidate] for the given `candidates` at the provided `location`.
 * @param [candidates] The candidates.
 * @param [location] The location where the gesture was initiated.
 * @param [resolveCandidates] Determines whether [PortCandidateValidity.DYNAMIC] ports should be resolved with respect to the `location` or not.
 * @return The candidate to use or `null`.
 * @see [resolveSourcePortCandidates]
 * @see [portCandidateResolutionRecognizer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getSourcePortCandidate">Online Documentation</a>
 */
 open protected   fun getSourcePortCandidate( candidates: IEnumerable<IPortCandidate> ,
 location: Point ,
 resolveCandidates: Boolean ):IPortCandidate?
/**
 * Finds the source [port candidate provider][IPortCandidateProvider] at the specified location.
 * @param [sourceLocation] The location of the mouse at the beginning of the gesture.
 * @return The port candidate provider to use for the source of the edge creation or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getSourcePortCandidateProvider">Online Documentation</a>
 */
 open protected   fun getSourcePortCandidateProvider( sourceLocation: Point ):IPortCandidateProvider?
/**
 * Gets the source port candidates for the given `location`.
 * @param [location] The location to get the port candidates for.
 * @return The port candidates for the given location or `null` if there are none.
 * @see [getSource]
 * @see [getSourcePortCandidateProvider]
 * @see [IPortCandidateProvider.getAllSourcePortCandidates]
 * @see [IPortCandidateProvider.getAllTargetPortCandidates]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getSourcePortCandidates">Online Documentation</a>
 */
 open protected   fun getSourcePortCandidates( location: Point ):IEnumerable<IPortCandidate>?
/**
 * Finds the target [port owner][IPortOwner] at the specified location.
 * @param [targetLocation] The location of the pointer at the beginning of the gesture.
 * @return The port owner or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getTarget">Online Documentation</a>
 */
 open protected   fun getTarget( targetLocation: Point ):IPortOwner?
/**
 * Retrieves the [IPortCandidateProvider] instance that provides the possible candidates for the target of the edge given the current source candidate.
 * @param [sourcePortCandidate] The candidate at the other end of the edge that has been chosen for the edge creation. In case of [reversed edge creation][reversedEdgeCreation] this is actually the candidate for the [target end][IEdge.targetPort]of the edge.
 * @param [location] The location of the mouse.
 * @return The provider to get the port candidates from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getTargetPortCandidateProvider">Online Documentation</a>
 */
 open protected   fun getTargetPortCandidateProvider( sourcePortCandidate: IPortCandidate ,
 location: Point ):IPortCandidateProvider?
/**
 * Retrieves the target port candidates for a given location in world coordinates.
 * @param [location] The location of the mouse in world coordinates.
 * @param [resolveCandidates] Determines whether [PortCandidateValidity.DYNAMIC] ports should be resolved with respect to the `location` or not.
 * @return A possibly empty enumeration over all target port candidates.
 * @see [sourcePortCandidate]
 * @see [resolveTargetPortCandidates]
 * @see [portCandidateResolutionRecognizer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-getTargetPortCandidates">Online Documentation</a>
 */
 open protected   fun getTargetPortCandidates( location: Point ,
 resolveCandidates: Boolean ):IEnumerable<IPortCandidate>
/**
 * Installs this mode into the given context that is provided by the canvas.
 * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [IInputMode.uninstall]. A reference to the context may be kept and queried during the time the mode is installed.
 * @param [controller] The [controller] for this mode.
 * @see [IInputMode.uninstall]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Retrieves the port candidate provider instance given a source port owner.
 * @param [sourceOwner] The [IPortOwner] to find the candidates for.
 * @return A provider instance or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-lookupSourcePortCandidateProvider">Online Documentation</a>
 */
 open protected   fun lookupSourcePortCandidateProvider( sourceOwner: IPortOwner ):IPortCandidateProvider?
/**
 * Retrieves the port candidate provider instance given a source port candidate and a possible target item.
 * @param [sourcePortCandidate] The current source port candidate.
 * @param [targetOwner] The [IPortOwner] to find the candidates for.
 * @param [location] The location of the mouse.
 * @return A provider instance or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-lookupTargetPortCandidateProvider">Online Documentation</a>
 */
 open protected   fun lookupTargetPortCandidateProvider( sourcePortCandidate: IPortCandidate? ,
 targetOwner: IPortOwner ,
 location: Point ):IPortCandidateProvider?
/**
 * Measures the distance between a port `candidate` and a given `location`.
 * @param [candidate] The port candidate.
 * @param [location] The location in world coordinates.
 * @return The distance between the `candidate` and the `location` (in world coordinates if no [CanvasComponent.projection][yfiles.view.CanvasComponent.projection] is set; in view coordinates if it has.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-measureDistance">Online Documentation</a>
 */
 final protected   fun measureDistance( candidate: IPortCandidate ,
 location: Point ):Double
/**
 * Called after [cancel] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled()
/**
 * Called after the [ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * Called after the edge has been finalized.
 * @param [event] The event argument holding the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onEdgeCreated">Online Documentation</a>
 */
 open protected   fun onEdgeCreated( event: EdgeEventArgs )
/**
 * Raises the [EdgeCreationStarted] event when the gesture for creating an edge has been initialized.
 * @param [event] The [EdgeEventArgs] instance containing the dummy edge that will be used during edge creation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onEdgeCreationStarted">Online Documentation</a>
 */
 open protected   fun onEdgeCreationStarted( event: EdgeEventArgs )
/**
 * Triggers the [GestureCanceled] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onGestureCanceled">Online Documentation</a>
 */
 open protected   fun onGestureCanceled( event: InputModeEventArgs )
/**
 * Triggers the [GestureCanceling] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onGestureCanceling">Online Documentation</a>
 */
 open protected   fun onGestureCanceling( event: InputModeEventArgs )
/**
 * Called once the drag has been finalized.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onGestureFinished">Online Documentation</a>
 */
 open protected   fun onGestureFinished( event: InputModeEventArgs )
/**
 * Called before the drag will be finalized.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onGestureFinishing">Online Documentation</a>
 */
 open protected   fun onGestureFinishing( event: InputModeEventArgs )
/**
 * Triggers the [GestureStarted] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onGestureStarted">Online Documentation</a>
 */
 open protected   fun onGestureStarted( event: InputModeEventArgs )
/**
 * Triggers the [GestureStarting] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onGestureStarting">Online Documentation</a>
 */
 open protected   fun onGestureStarting( event: InputModeEventArgs )
/**
 * Called at the end of each drag.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onMoved">Online Documentation</a>
 */
 open protected   fun onMoved( event: InputModeEventArgs )
/**
 * Called at the start of each drag.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onMoving">Online Documentation</a>
 */
 open protected   fun onMoving( event: InputModeEventArgs )
/**
 * Raises the [PortAdded] event if the mode has [added a port][IGraph.addPort] for the source or target node to complete the edge creation.
 * @param [event] The [ItemEventArgs] instance containing the port that has been added.
 * @see [addPortAddedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onPortAdded">Online Documentation</a>
 */
 open protected   fun onPortAdded( event: ItemEventArgs<IPort> )
/**
 * Called when the [reversedEdgeCreation] property changes and the edge creation is [in progress][isCreationInProgress].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onReversedEdgeCreationChanged">Online Documentation</a>
 */
 open protected   fun onReversedEdgeCreationChanged()
/**
 * Triggers the [SourcePortCandidateChanged] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onSourcePortCandidateChanged">Online Documentation</a>
 */
 open protected   fun onSourcePortCandidateChanged( event: ItemEventArgs<IPortCandidate?> )
/**
 * Called after [tryStop] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onStopped">Online Documentation</a>
 */
 open protected   fun onStopped()
/**
 * Triggers the [TargetPortCandidateChanged] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-onTargetPortCandidateChanged">Online Documentation</a>
 */
 open protected   fun onTargetPortCandidateChanged( event: ItemEventArgs<IPortCandidate?> )
/**
 * Sets the position of the tip of the edge during creation.
 * @param [newLocation] The location of the tip of the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-relocateDragPoint">Online Documentation</a>
 */
 open protected   fun relocateDragPoint( newLocation: Point )
/**
 * Returns an enumerable over the given candidates where no instance has [PortCandidateValidity.DYNAMIC] [IPortCandidate.validity].
 * @param [candidates] The candidates to possibly resolve.
 * @param [location] The location to resolve dynamic candidates against or `null` if they should be discarded instead.
 * @return An enumerable of non-[PortCandidateValidity.DYNAMIC] port candidates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-resolveCandidates">Online Documentation</a>
 */
 open protected   fun resolveCandidates( candidates: IEnumerable<IPortCandidate> ,
 location: Point? ):IEnumerable<IPortCandidate>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * Uninstalls this mode from the given context.
 * @param [context] The context to deregister from. This is the same instance that had been passed to [IInputMode.install] during installation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Updates the [dummyEdge] to reflect the current source port candidate.
 * @param [sourcePortCandidate] The new owner target port candidate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-updateDummyEdgeSourcePort">Online Documentation</a>
 */
 open protected   fun updateDummyEdgeSourcePort( sourcePortCandidate: IPortCandidate? )
/**
 * Updates the [dummyEdge] to reflect the current target port candidate.
 * @param [targetPortCandidate] The new owner target port candidate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-updateDummyEdgeTargetPort">Online Documentation</a>
 */
 open protected   fun updateDummyEdgeTargetPort( targetPortCandidate: IPortCandidate? )
/**
 * Draws the highlight for the owner of the current [targetPortCandidate].
 * @param [oldCandidate] The port candidate whose owner is currently highlighted.
 * @param [newCandidate] The port candidate whose owner should be highlighted.
 * @see [showTargetHighlight]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-updateTargetHighlight">Online Documentation</a>
 */
 open protected   fun updateTargetHighlight( oldCandidate: IPortCandidate? ,
 newCandidate: IPortCandidate? )
/**
 * Updates the drag point.
 * @param [location] The new coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23CreateEdgeInputMode-method-updateTargetLocation">Online Documentation</a>
 */
 open protected   fun updateTargetLocation( location: Point )
/**
 * Occurs when the value of the [sourcePortCandidate] property changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23SourcePortCandidateChanged">Online Documentation</a>
 */
fun addSourcePortCandidateChangedListener(listener: EventHandler1<ItemEventArgs<IPortCandidate?>>)
fun removeSourcePortCandidateChangedListener(listener: EventHandler1<ItemEventArgs<IPortCandidate?>>)

/**
 * Occurs when the value of the [targetPortCandidate] property changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23TargetPortCandidateChanged">Online Documentation</a>
 */
fun addTargetPortCandidateChangedListener(listener: EventHandler1<ItemEventArgs<IPortCandidate?>>)
fun removeTargetPortCandidateChangedListener(listener: EventHandler1<ItemEventArgs<IPortCandidate?>>)

/**
 * Occurs after an edge has been created by this mode.
 * @see [onEdgeCreated]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23EdgeCreated">Online Documentation</a>
 */
fun addEdgeCreatedListener(listener: EventHandler1<EdgeEventArgs>)
fun removeEdgeCreatedListener(listener: EventHandler1<EdgeEventArgs>)

/**
 * Occurs when this instance [adds a port][IGraph.addPort] to the source or target node during completion of the edge creation gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23PortAdded">Online Documentation</a>
 */
fun addPortAddedListener(listener: EventHandler1<ItemEventArgs<IPort>>)
fun removePortAddedListener(listener: EventHandler1<ItemEventArgs<IPort>>)

/**
 * Occurs before the gesture will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23GestureFinishing">Online Documentation</a>
 */
fun addGestureFinishingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeGestureFinishingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs once the gesture has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23GestureFinished">Online Documentation</a>
 */
fun addGestureFinishedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeGestureFinishedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs once the actual creation gesture is starting, that is when starting to drag the edge from its source node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23GestureStarting">Online Documentation</a>
 */
fun addGestureStartingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeGestureStartingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs once the actual creation gesture is initialized and has started, that is when the edge is dragged from its source node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23GestureStarted">Online Documentation</a>
 */
fun addGestureStartedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeGestureStartedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs at the start of every drag or move.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23Moving">Online Documentation</a>
 */
fun addMovingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeMovingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs at the end of every drag or move.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23Moved">Online Documentation</a>
 */
fun addMovedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeMovedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs when the gesture has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23GestureCanceled">Online Documentation</a>
 */
fun addGestureCanceledListener(listener: EventHandler1<InputModeEventArgs>)
fun removeGestureCanceledListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs before the gesture will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23GestureCanceling">Online Documentation</a>
 */
fun addGestureCancelingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeGestureCancelingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs when the edge creation has started, that is when the cursor is dragged over the source node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23EdgeCreationStarted">Online Documentation</a>
 */
fun addEdgeCreationStartedListener(listener: EventHandler1<EdgeEventArgs>)
fun removeEdgeCreationStartedListener(listener: EventHandler1<EdgeEventArgs>)

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
 * Occurs when the value of the [sourcePortCandidate] property changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23SourcePortCandidateChanged">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addSourcePortCandidateChangedHandler(
    crossinline handler: (item:IPortCandidate?) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<IPortCandidate?>> = { _, event -> handler(event.item) }
    addSourcePortCandidateChangedListener(listener)
    return { removeSourcePortCandidateChangedListener(listener) }
}
/**
 * Occurs when the value of the [targetPortCandidate] property changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23TargetPortCandidateChanged">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addTargetPortCandidateChangedHandler(
    crossinline handler: (item:IPortCandidate?) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<IPortCandidate?>> = { _, event -> handler(event.item) }
    addTargetPortCandidateChangedListener(listener)
    return { removeTargetPortCandidateChangedListener(listener) }
}
/**
 * Occurs after an edge has been created by this mode.
 * @see [onEdgeCreated]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23EdgeCreated">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addEdgeCreatedHandler(
    crossinline handler: (event:EdgeEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<EdgeEventArgs> = { _, event -> handler(event) }
    addEdgeCreatedListener(listener)
    return { removeEdgeCreatedListener(listener) }
}
/**
 * Occurs when this instance [adds a port][IGraph.addPort] to the source or target node during completion of the edge creation gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23PortAdded">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addPortAddedHandler(
    crossinline handler: (item:IPort) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<IPort>> = { _, event -> handler(event.item) }
    addPortAddedListener(listener)
    return { removePortAddedListener(listener) }
}
/**
 * Occurs before the gesture will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23GestureFinishing">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addGestureFinishingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addGestureFinishingListener(listener)
    return { removeGestureFinishingListener(listener) }
}
/**
 * Occurs once the gesture has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23GestureFinished">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addGestureFinishedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addGestureFinishedListener(listener)
    return { removeGestureFinishedListener(listener) }
}
/**
 * Occurs once the actual creation gesture is starting, that is when starting to drag the edge from its source node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23GestureStarting">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addGestureStartingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addGestureStartingListener(listener)
    return { removeGestureStartingListener(listener) }
}
/**
 * Occurs once the actual creation gesture is initialized and has started, that is when the edge is dragged from its source node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23GestureStarted">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addGestureStartedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addGestureStartedListener(listener)
    return { removeGestureStartedListener(listener) }
}
/**
 * Occurs at the start of every drag or move.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23Moving">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addMovingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addMovingListener(listener)
    return { removeMovingListener(listener) }
}
/**
 * Occurs at the end of every drag or move.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23Moved">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addMovedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addMovedListener(listener)
    return { removeMovedListener(listener) }
}
/**
 * Occurs when the gesture has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23GestureCanceled">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addGestureCanceledHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addGestureCanceledListener(listener)
    return { removeGestureCanceledListener(listener) }
}
/**
 * Occurs before the gesture will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23GestureCanceling">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addGestureCancelingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addGestureCancelingListener(listener)
    return { removeGestureCancelingListener(listener) }
}
/**
 * Occurs when the edge creation has started, that is when the cursor is dragged over the source node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CreateEdgeInputMode%23EdgeCreationStarted">Online Documentation</a>
 */
inline fun  CreateEdgeInputMode.addEdgeCreationStartedHandler(
    crossinline handler: (event:EdgeEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<EdgeEventArgs> = { _, event -> handler(event) }
    addEdgeCreationStartedListener(listener)
    return { removeEdgeCreationStartedListener(listener) }
}
