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
 * Provides implementation singletons and utility methods for event recognizers.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers">Online Documentation</a>
 */
external object EventRecognizers {
/**
 * An event recognizer that will always return true;
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23ALWAYS">Online Documentation</a>
 */
 val ALWAYS: EventRecognizer
/**
 * An event recognizer that will always return false;
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23NEVER">Online Documentation</a>
 */
 val NEVER: EventRecognizer
/**
 * Creates an instance that is the logical 'and' combination of the provided recognizers.
 * @param [recognizers] The recognizers to perform the logical operation on.
 * @return An instance that is the result of the logical 'and' operation of the provided instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23EventRecognizers-method-createAndRecognizer">Online Documentation</a>
 */
 final   fun createAndRecognizer(vararg  recognizers: EventRecognizer ):EventRecognizer
/**
 * Creates an instance that is the logical 'or' combination of the provided recognizers.
 * @param [recognizers] The recognizers to perform the logical operation on.
 * @return An instance that is the result of the logical 'or' operation of the provided instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23EventRecognizers-method-createOrRecognizer">Online Documentation</a>
 */
 final   fun createOrRecognizer(vararg  recognizers: EventRecognizer ):EventRecognizer
/**
 * Creates an event recognizer instance that yields the boolean inverse of the given event recognizer.
 * @param [recognizer] The recognizer to invert.
 * @return An implementation that performs the logical negation for the argument.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EventRecognizers%23EventRecognizers-defaultmethod-inverse">Online Documentation</a>
 */
   fun inverse( recognizer: EventRecognizer ):EventRecognizer
}
