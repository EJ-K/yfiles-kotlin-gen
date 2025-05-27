// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

/**
 * Provides commonly used predefined event recognizers that deal with [yfiles.view.MouseEventArgs].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers">Online Documentation</a>
 */
external object MouseEventRecognizers {
/**
 * An event recognizer that identifies button clicks.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23CLICK">Online Documentation</a>
 */
 val CLICK: EventRecognizer
/**
 * An event recognizer that identifies `mousedown` events.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23DOWN">Online Documentation</a>
 */
 val DOWN: EventRecognizer
/**
 * An event recognizer that identifies mouse drag events.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23DRAG">Online Documentation</a>
 */
 val DRAG: EventRecognizer
/**
 * An event recognizer that identifies when the mouse has entered the control.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23ENTER">Online Documentation</a>
 */
 val ENTER: EventRecognizer
/**
 * An event recognizer that identifies if any mouse button is currently down.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23IS_DOWN">Online Documentation</a>
 */
 val IS_DOWN: EventRecognizer
/**
 * An event recognizer that identifies when the has left the control.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23LEAVE">Online Documentation</a>
 */
 val LEAVE: EventRecognizer
/**
 * An event recognizer that identifies left mouse button clicks.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23LEFT_CLICK">Online Documentation</a>
 */
 val LEFT_CLICK: EventRecognizer
/**
 * An event recognizer that identifies left mouse button double clicks.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23LEFT_DOUBLE_CLICK">Online Documentation</a>
 */
 val LEFT_DOUBLE_CLICK: EventRecognizer
/**
 * An event recognizer that identifies `mousedown` events of left mouse button.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23LEFT_DOWN">Online Documentation</a>
 */
 val LEFT_DOWN: EventRecognizer
/**
 * An event recognizer that identifies left mouse button drags.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23LEFT_DRAG">Online Documentation</a>
 */
 val LEFT_DRAG: EventRecognizer
/**
 * An event recognizer that identifies if the left mouse button is currently down.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23LEFT_IS_DOWN">Online Documentation</a>
 */
 val LEFT_IS_DOWN: EventRecognizer
/**
 * An event recognizer that identifies `mouseup` events of left mouse button.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23LEFT_UP">Online Documentation</a>
 */
 val LEFT_UP: EventRecognizer
/**
 * An event recognizer that identifies mouse input capture lost events.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23LOST_CAPTURE">Online Documentation</a>
 */
 val LOST_CAPTURE: EventRecognizer
/**
 * An event recognizer that identifies mouse input capture lost events while at least one mouse button was pressed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23LOST_CAPTURE_DURING_DRAG">Online Documentation</a>
 */
 val LOST_CAPTURE_DURING_DRAG: EventRecognizer
/**
 * An event recognizer that identifies middle mouse button clicks.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23MIDDLE_CLICK">Online Documentation</a>
 */
 val MIDDLE_CLICK: EventRecognizer
/**
 * An event recognizer that identifies middle mouse button double clicks.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23MIDDLE_DOUBLE_CLICK">Online Documentation</a>
 */
 val MIDDLE_DOUBLE_CLICK: EventRecognizer
/**
 * An event recognizer that identifies middle mouse button drags.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23MIDDLE_DRAG">Online Documentation</a>
 */
 val MIDDLE_DRAG: EventRecognizer
/**
 * An event recognizer that identifies if the middle mouse button is currently down.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23MIDDLE_IS_DOWN">Online Documentation</a>
 */
 val MIDDLE_IS_DOWN: EventRecognizer
/**
 * An event recognizer that identifies mouse movements that are not drags.
 * @see [DRAG]
 * @see [MOVE_OR_DRAG]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23MOVE">Online Documentation</a>
 */
 val MOVE: EventRecognizer
/**
 * An event recognizer that identifies mouse movements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23MOVE_OR_DRAG">Online Documentation</a>
 */
 val MOVE_OR_DRAG: EventRecognizer
/**
 * An event recognizer that identifies button multi-clicks.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23MULTI_CLICK">Online Documentation</a>
 */
 val MULTI_CLICK: EventRecognizer
/**
 * An event recognizer that identifies right mouse button clicks.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23RIGHT_CLICK">Online Documentation</a>
 */
 val RIGHT_CLICK: EventRecognizer
/**
 * An event recognizer that identifies right mouse button double clicks.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23RIGHT_DOUBLE_CLICK">Online Documentation</a>
 */
 val RIGHT_DOUBLE_CLICK: EventRecognizer
/**
 * An event recognizer that identifies `mousedown` events of right mouse button.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23RIGHT_DOWN">Online Documentation</a>
 */
 val RIGHT_DOWN: EventRecognizer
/**
 * An event recognizer that identifies right mouse button drags.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23RIGHT_DRAG">Online Documentation</a>
 */
 val RIGHT_DRAG: EventRecognizer
/**
 * An event recognizer that identifies if the right mouse button is currently down.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23RIGHT_IS_DOWN">Online Documentation</a>
 */
 val RIGHT_IS_DOWN: EventRecognizer
/**
 * An event recognizer that identifies `mouseup` events of right mouse button.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23RIGHT_UP">Online Documentation</a>
 */
 val RIGHT_UP: EventRecognizer
/**
 * An event recognizer that identifies `mouseup` events.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MouseEventRecognizers%23UP">Online Documentation</a>
 */
 val UP: EventRecognizer
}
