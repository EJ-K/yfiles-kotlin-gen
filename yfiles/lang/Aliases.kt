// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.lang

/**
 * Encapsulates a method that has no parameters and does not return a value.
 */
typealias Action = () -> Unit

/**
 * Encapsulates a method that has a single parameter and does not return a value.
 * @param [obj] The parameter of the method that this delegate encapsulates.
 */
typealias Action1<T> = (obj: T) -> Unit

/**
 * Encapsulates a method that has two parameters and does not return a value.
 * @param [arg1] The first parameter of the method that this delegate encapsulates.
 * @param [arg2] The second parameter of the method that this delegate encapsulates.
 */
typealias Action2<T1, T2> = (arg1: T1, arg2: T2) -> Unit

/**
 * Encapsulates a method that has two parameters and does not return a value.
 * @param [arg1] The first parameter of the method that this delegate encapsulates.
 * @param [arg2] The second parameter of the method that this delegate encapsulates.
 * @param [arg3] The third parameter of the method that this delegate encapsulates.
 */
typealias Action3<T1, T2, T3> = (arg1: T1, arg2: T2, arg3: T3) -> Unit

/**
 * Encapsulates a method that compares two objects.
 * @param [x] The first object to compare.
 * @param [y] The second object to compare.
 * @return An integer value which is `<0` if `x` is less than `y`, `0` if `x` is equal to `y`, or `>0` if `x` is greater than `y`
 */
typealias Comparison1<T> = (x: T, y: T) -> Number

/**
 * Represents the method that will handle an event that has no event data.
 * @param [event] An object that contains no event data.
 * @param [sender] The source of the event.
 */
typealias EventHandler = (event: EventArgs, sender: IEventDispatcher) -> Unit

/**
 * Represents the method that will handle an event when the event provides data.
 * @param [event] An object that contains the event data.
 * @param [sender] The source of the event.
 */
typealias EventHandler1<TEventArgs> = (event: TEventArgs, sender: IEventDispatcher) -> Unit

/**
 * Encapsulates a method that has no parameters and returns a value of the type specified by the `TResult` parameter.
 * @return The return value of the method that this delegate encapsulates.
 */
typealias Func1<TResult> = () -> TResult

/**
 * Encapsulates a method that has one parameters and returns a value of the type specified by the `TResult` parameter.
 * @param [arg] The parameter of the method that this delegate encapsulates.
 * @return The return value of the method that this delegate encapsulates.
 */
typealias Func2<T1, TResult> = (arg: T1) -> TResult

/**
 * Encapsulates a method that has two parameters and returns a value of the type specified by the `TResult` parameter.
 * @param [arg1] The first parameter of the method that this delegate encapsulates.
 * @param [arg2] The second parameter of the method that this delegate encapsulates.
 * @return The return value of the method that this delegate encapsulates.
 */
typealias Func3<T1, T2, TResult> = (arg1: T1, arg2: T2) -> TResult

/**
 * Encapsulates a method that has three parameters and returns a value of the type specified by the `TResult` parameter.
 * @param [arg1] The first parameter of the method that this delegate encapsulates.
 * @param [arg2] The second parameter of the method that this delegate encapsulates.
 * @param [arg3] The third parameter of the method that this delegate encapsulates.
 * @return The return value of the method that this delegate encapsulates.
 */
typealias Func4<T1, T2, T3, TResult> = (arg1: T1, arg2: T2, arg3: T3) -> TResult

/**
 * Represents the method that defines a set of criteria and determines whether the specified object meets those criteria.
 * @param [obj] The object to compare against the criteria defined within the method represented by this delegate.
 * @return `true` if obj meets the criteria defined within the method represented by this delegate; otherwise, `false`.
 */
typealias Predicate<T> = (obj: T) -> Boolean

/**
 * Defines the handler for a [property-changed][IPropertyObservable] event.
 * @param [event] The arguments which define the change.
 * @param [sender] The object which dispatched the event.
 */
typealias PropertyChangedEventHandler = (event: PropertyChangedEventArgs, sender: IEventDispatcher) -> Unit
